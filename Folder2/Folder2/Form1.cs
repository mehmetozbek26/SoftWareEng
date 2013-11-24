using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace Folder2
internal sealed class PropertyData<T> : IPropertyData<T>, IInterceptablePropertyData, ISupportExceptions
{
    private Exception exceptionToThrow;

    public PropertyData()
    {
        eventsToRaise = new List<EventWrapper>();
        setHasBeenCalled = 0;
        getHasBeenCalled = 0;
        exceptionToThrow = null;
    }

    public IPropertyData<T> ThrowsOnSet<TEx>() where TEx : Exception
    {
        exceptionToThrow = (Exception)Activator.CreateInstance<TEx>();
        return this;
    }

    public IPropertyData<T> ThrowsOnSet(Exception ex)
    {
        exceptionToThrow = ex;
        return this;
    }

    #region ISupportExceptions members

    Exception ISupportExceptions.ExceptionToThrow
    {
        get { return exceptionToThrow; }
        set { exceptionToThrow = value; }
    }

    bool ISupportExceptions.HasException
    {
        get { return exceptionToThrow != null; }
    }

    #endregion
}
﻿using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace Folder2
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            public sealed class MixingDeskBuilder
{
    private const int DEFAULT_CHANNELS = 10;
    private int channels = DEFAULT_CHANNELS;

    public int Channels
    {
        get { return channels; }
        set { channels = value; }
    }

    public MixingDesk GetValue()
    {
        return new MixingDesk(channels);
    }
}public class SamplerBuilder
{
    private StudioBuilder parent;
    private int hardDiskSize;
    private string model;

    public SamplerBuilder(StudioBuilder parent)
    {
        this.parent = parent;
    }

    public SamplerBuilder DiskSize(int hardDiskSize)
    {
        this.hardDiskSize = hardDiskSize;
        return this;
    }

    public SamplerBuilder Model(string model)
    {
        this.model = model;
        return this;
    }

  public IPropertyData<T> SetupProperty(Expression<Func<T, Object>> property, object returnValue)
{
    PropertyData<T> propertyData = GetPropertyFromExpression(property);
    propertyData.Returns(returnValue);
    allPropertiesForProxy.Add(propertyData);
    return propertyData;
}
}

//------------------------------------------------------------------------------
// <auto-generated>
//    This code was generated from a template.
//
//    Manual changes to this file may cause unexpected behavior in your application.
//    Manual changes to this file will be overwritten if the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace Software
{
    using System;
    using System.Collections.Generic;
    
    public partial class Program
    {
        public Program()
        {
            this.Rezervasyon = new HashSet<Rezervasyon>();
        }
    
        public System.DateTime Tarih { get; set; }
        public int Ders1 { get; set; }
        public int Ders2 { get; set; }
        public int Ders3 { get; set; }
        public int Ders4 { get; set; }
        public int Ders5 { get; set; }
        public int Ders6 { get; set; }
        public int Kapasite { get; set; }
    
        public virtual Kategori Kategori { get; set; }
        public virtual Kategori Kategori1 { get; set; }
        public virtual Kategori Kategori2 { get; set; }
        public virtual Kategori Kategori3 { get; set; }
        public virtual Kategori Kategori4 { get; set; }
        public virtual Kategori Kategori5 { get; set; }
        public virtual ICollection<Rezervasyon> Rezervasyon { get; set; }
    }
}

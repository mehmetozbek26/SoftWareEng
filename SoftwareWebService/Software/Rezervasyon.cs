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
    
    public partial class Rezervasyon
    {
        public int ID { get; set; }
        public System.DateTime Tarih { get; set; }
        public string TC { get; set; }
        public System.DateTime RezervasyonTarihi { get; set; }
    
        public virtual Kullanici Kullanici { get; set; }
        public virtual Program Program { get; set; }
    }
}

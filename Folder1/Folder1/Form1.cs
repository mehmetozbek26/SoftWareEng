using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace Folder1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            public class StudioBuilder
{
    private MixingDeskBuilder currentMixingDesk;
    private SamplerBuilder currentSampler;
    private List<Sampler> loadedSamplers = new List<Sampler>();


    public static StudioBuilder Studio()
    {
        return new StudioBuilder();
    }


    public StudioBuilder MixingDesk()
    {
        currentMixingDesk = new MixingDeskBuilder();
        return this;
    }

    public StudioBuilder Channels(int channels)
    {
        currentMixingDesk.Channels = channels;
        return this;
    }


    public SamplerBuilder Sampler()
    {
        if (currentSampler != null)
            loadedSamplers.Add(currentSampler.GetValue());

        currentSampler = new SamplerBuilder(this);
        return currentSampler;
    }

    public Studio End()
    {
        return GetValue();
    }

    private Studio GetValue()
    {
        return new Studio(currentMixingDesk.GetValue(), Samplers);
    }

    private List<Sampler> Samplers
    {
        get
        {
            List<Sampler> samplers = new List<Sampler>();
            samplers.AddRange(loadedSamplers);
            if (currentSampler != null)
                samplers.Add(currentSampler.GetValue());
            return samplers;
        }
    }
}

        }
    }
}

﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace Aplicacao.Interface
{
    [XamlCompilation(XamlCompilationOptions.Compile)]
    public partial class Registo : ContentPage
    {
        public Registo()
        {
            NavigationPage.SetHasNavigationBar(this, false);
            InitializeComponent();
        }
    }
}
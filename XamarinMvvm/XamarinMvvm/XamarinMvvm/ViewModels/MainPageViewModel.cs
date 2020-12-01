using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Text;
using System.Windows.Input;
using Xamarin.Forms;
using XamarinMvvm.Models;

namespace XamarinMvvm.ViewModels
{
    public class MainPageViewModel : ViewModelBase
    {


        private Animal _animal;
        public Animal Animal
        {
            get => _animal;
            set => Set(ref _animal, value);
        }


        private int _count;
        public int Count
        {
            get => _count;
            set => Set(ref _count, value);
        }

        public ICommand ClickMeCommand => new Command(() =>  this.ClickMe());

        public MainPageViewModel() {
            Animal = new Animal
            {
                Name = "Dog",
                Counter = 0
            };

  
        }

        private void ClickMe()
        {
            Count =  Animal.Counter++;
        }
    }
}

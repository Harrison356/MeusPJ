from django.urls import path
from app_usuarios import views
urlpatterns = [
    # rota, view, resposável, nome de rederência 
    path('',views.home, name='home'),
]

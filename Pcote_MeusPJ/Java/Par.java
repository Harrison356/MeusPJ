����   7 a  Main  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LMain; main ([Ljava/lang/String;)V	    java/util/Locale   US Ljava/util/Locale;
     
setDefault (Ljava/util/Locale;)V  java/util/Scanner	    java/lang/System   ! in Ljava/io/InputStream;
  #  $ (Ljava/io/InputStream;)V	  & ' ( out Ljava/io/PrintStream; * Digite o primeiro numero: 
 , . - java/io/PrintStream / 0 println (Ljava/lang/String;)V
  2 3 4 nextInt ()I 6 Digite o segundo numero: 
 , 8 / 9 (I)V ; O numero é par = O numero é impar   ? @ A makeConcatWithConstants (I)Ljava/lang/String;
  C D  close args [Ljava/lang/String; sc Ljava/util/Scanner; n1 I n2 soma res StackMapTable F 
SourceFile 	Main.java BootstrapMethods
 T V U $java/lang/invoke/StringConcatFactory @ W �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; S Z O Numero digitado foi:  InnerClasses ] %java/lang/invoke/MethodHandles$Lookup _ java/lang/invoke/MethodHandles Lookup !               /     *� �    
                    	           j� � � Y� � "L� %)� ++� 1=� %5� ++� 1>`6d6� %� 7p� � %:� +� � %<� +� %� >  � ++� B�    
   B    	  
       &  +  0  6  >  E  M  P  X " e & i '    >    j E F    Y G H   L I J  + ? K J  0 : L J  6 4 M J  N    � P  O     P    Q R     X  Y [   
  \ ^ ` 
����   7 s  Main  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LMain; main ([Ljava/lang/String;)V	    java/util/Locale   US Ljava/util/Locale;
     
setDefault (Ljava/util/Locale;)V  java/util/Scanner	    java/lang/System   ! in Ljava/io/InputStream;
  #  $ (Ljava/io/InputStream;)V	  & ' ( out Ljava/io/PrintStream; * Dados da primeira pessoa: 
 , . - java/io/PrintStream / 0 println (Ljava/lang/String;)V 2 Nome: 
  4 5 6 nextLine ()Ljava/lang/String; 8 Idade: 
  : ; < nextInt ()I > Dados da segunda pessoa: @        B %.1f
 D F E java/lang/Double G H valueOf (D)Ljava/lang/Double;
 J L K java/lang/String M N format 9(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;   P Q R makeConcatWithConstants J(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  T U  close args [Ljava/lang/String; sc Ljava/util/Scanner; n1 Ljava/lang/String; n2 id1 I id2 med D 
SourceFile 	Main.java BootstrapMethods
 f h g $java/lang/invoke/StringConcatFactory Q i �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; e l "A idade media de e  eh de  Anos InnerClasses o %java/lang/invoke/MethodHandles$Lookup q java/lang/invoke/MethodHandles Lookup !               /     *� �    
                    	      9 
    �� � � Y� � "L� %)� +� %1� ++� 3M� %7� ++� 96� %=� +� %1� ++� 3W+� 3N� %7� ++� 96`� ?o9� %,-A� Y� CS� I� O  � ++� S�    
   N    	  
     !  &  .  4  <  D  I  N  V  \  h  m   �  � ! � "    H    � V W    z X Y  & e Z [  N = \ [  4 W ] ^  \ / _ ^  h # ` a   b    c d     j  k m   
  n p r 
����   7 Y  Main  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LMain; main ([Ljava/lang/String;)V	    java/util/Locale   US Ljava/util/Locale;
     
setDefault (Ljava/util/Locale;)V  java/util/Scanner	    java/lang/System   ! in Ljava/io/InputStream;
  #  $ (Ljava/io/InputStream;)V	  & ' ( out Ljava/io/PrintStream; *  Digite o valor inteiro de dois: 
 , . - java/io/PrintStream / 0 println (Ljava/lang/String;)V
  2 3 4 nextInt ()I   6 7 8 makeConcatWithConstants (I)Ljava/lang/String;
  : ;  close args [Ljava/lang/String; sc Ljava/util/Scanner; x I y troca soma i StackMapTable = 
SourceFile 	Main.java BootstrapMethods
 L N M $java/lang/invoke/StringConcatFactory 7 O �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; K R Soma dos impares:  InnerClasses U %java/lang/invoke/MethodHandles$Lookup W java/lang/invoke/MethodHandles Lookup !               /     *� �    
                    	      .     d� � � Y� � "L� %)� ++� 1=+� 1>� 6=>6`6� p� 
`6���� %� 5  � ++� 9�    
   F    	  
       #  (  +  -  0  3  ;  B  I  R  _ ! c "    H    d < =    S > ?   F @ A  # A B A  +  C A  3 1 D A  8  E A  F    � 0 � 
  G      H    I J     P  Q S   
  T V X 
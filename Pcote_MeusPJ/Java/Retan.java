����   7 y  Main  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LMain; main ([Ljava/lang/String;)V	    java/util/Locale   US Ljava/util/Locale;
     
setDefault (Ljava/util/Locale;)V  java/util/Scanner	    java/lang/System   ! in Ljava/io/InputStream;
  #  $ (Ljava/io/InputStream;)V	  & ' ( out Ljava/io/PrintStream; * Digite a base do retangulo: 
 , . - java/io/PrintStream / 0 println (Ljava/lang/String;)V
  2 3 4 
nextDouble ()D 6 Digite a altura do retangulo: @       
 : < ; java/lang/Math = > pow (DD)D
 : @ A B sqrt (D)D D %.4f
 F H G java/lang/Double I J valueOf (D)Ljava/lang/Double;
 L N M java/lang/String O P format 9(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;   R S T makeConcatWithConstants &(Ljava/lang/String;)Ljava/lang/String;  R  R
  X Y  close args [Ljava/lang/String; sc Ljava/util/Scanner; bas D alt area peri diag 
SourceFile 	Main.java BootstrapMethods
 h j i $java/lang/invoke/StringConcatFactory S k �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; g n Area:  p Perimetro:  r Diagonal:  InnerClasses u %java/lang/invoke/MethodHandles$Lookup w java/lang/invoke/MethodHandles Lookup !               /     *� �    
                    	      H 
    �� � � Y� � "L� %)� ++� 1I� %5� ++� 19(k9 7(k 7kc9( 7� 9 7� 9c� ?9
� %C� Y� ES� K� Q  � +� %C� Y� ES� K� U  � +� %C� Y
� ES� K� V  � ++� W�    
   :    	  
       &  ,  2  @  U  q  �  �  �     H    � Z [    � \ ]   � ^ _  , � ` _  2 | a _  @ n b _  U Y c _ 
  d    e f     l  m l  o l  q s   
  t v x 
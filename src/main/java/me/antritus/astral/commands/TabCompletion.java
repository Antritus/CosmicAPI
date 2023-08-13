package me.antritus.astral.commands;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface TabCompletion
{
	String name();
	SenderType sender();
}
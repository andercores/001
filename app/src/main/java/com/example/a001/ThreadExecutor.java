package com.example.a001;

import java.util.concurrent.Executor;

public class ThreadExecutor implements Executor
{
    @Override
    public void execute(Runnable runnable)
    {
        new Thread(runnable).start();
    }
}

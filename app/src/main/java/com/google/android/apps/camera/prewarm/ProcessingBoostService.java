package com.google.android.apps.camera.prewarm;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import defpackage.hyf;
import defpackage.lho;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ProcessingBoostService extends Service {
    public hyf a;
    public Executor b;
    private final Messenger c = new Messenger(new lho(this));

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.c.getBinder();
    }
}

package defpackage;

import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class or extends byi {
    public final Object a;
    public final ExecutorService b;
    public volatile Handler c;

    public or() {
        super((char[]) null);
        this.a = new Object();
        this.b = Executors.newFixedThreadPool(4, new oq());
    }
}

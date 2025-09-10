package defpackage;

import android.media.MediaCodec;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class miq {
    public static final sgv a = sgv.g("miq");
    public final out f;
    public final MediaCodec.Callback g;
    public final owq i;
    public final mky j;
    public int k;
    public gcs l;
    public szh m;
    public mkv n;
    public oxd p;
    public final hbj q;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final AtomicLong c = new AtomicLong(0);
    public final AtomicLong d = new AtomicLong(0);
    public final AtomicLong e = new AtomicLong(0);
    public final Object h = new Object();
    public int o = 2;

    public miq(owq owqVar, hbj hbjVar, out outVar, mky mkyVar) {
        this.i = owqVar;
        this.q = hbjVar;
        this.f = outVar;
        this.j = mkyVar;
        this.g = new mio(this, hbjVar, mkyVar);
    }

    public final void a() {
        this.o = 2;
        this.l = null;
    }
}

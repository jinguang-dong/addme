package defpackage;

import android.content.Context;
import com.google.ar.core.R;
import j$.time.Duration;
import java.util.Timer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jyb extends ojl {
    public static final sgv a = sgv.g("jyb");
    public static final Duration b = Duration.ofMillis(8000);
    public final owq c;
    public final out d;
    public final Object e;
    public final rwu f;
    public nan g;
    public boolean h;
    public final nqg i;
    public final imi j;
    public int k;
    private final Timer l;
    private final nan m;

    public jyb(imi imiVar, Context context, out outVar, owq owqVar, Timer timer) {
        super((short[]) null);
        this.e = new Object();
        this.f = new rwu(rvj.a);
        this.k = 1;
        this.h = false;
        this.i = new jxz(this);
        this.j = imiVar;
        this.d = outVar;
        this.c = owqVar;
        this.l = timer;
        nao naoVar = new nao();
        naoVar.e = context.getResources().getString(R.string.amber_tap_on_subject_to_focus);
        naoVar.h = context;
        naoVar.j = 5;
        naoVar.b = 5000;
        naoVar.d = new nam() { // from class: jxy
            @Override // defpackage.nam
            public final void a(long j) {
                this.a.k = 1;
            }
        };
        this.m = naoVar.a();
    }

    public final void i() {
        synchronized (this.e) {
            this.k = 2;
            this.g = this.m;
            this.l.schedule(new jya(this), 500L);
            this.h = true;
        }
    }

    public final void j() {
        synchronized (this.e) {
            this.h = false;
            this.c.a(false);
            this.f.d();
        }
        k(this.k);
    }

    public final void k(int i) {
        int i2 = this.k;
        if (i2 == 1 || i2 != i) {
            return;
        }
        this.k = 1;
        nan nanVar = this.g;
        if (nanVar != null) {
            this.j.f(nanVar);
            this.g = null;
        }
    }
}

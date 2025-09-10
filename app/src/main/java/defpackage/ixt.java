package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.camera.legacy.app.app.CameraApp;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ixt extends jhl {
    private static final sgv s = sgv.g("ixt");
    public pbn o;
    public jgj p;
    public pnq q;
    public fqg r;
    private final Object t = new Object();
    private boolean u = false;
    private fdq v;
    private volatile iso w;
    private volatile gox z;

    public ixt() {
        getClass().getSimpleName();
    }

    private final void t() {
        if (this.u) {
            return;
        }
        synchronized (this.t) {
            if (!this.u) {
                izm izmVarG = ((CameraApp) getApplicationContext()).g();
                this.o = (pbn) izmVarG.k.a();
                this.r = (fqg) izmVarG.gT.a();
                this.p = jgo.c(izmVarG.zf);
                this.q = (pnq) izmVarG.b.a();
                this.v = fdq.h(this.r);
                this.u = true;
            }
        }
    }

    private final void u() {
        Integer.toHexString(hashCode());
    }

    @Override // defpackage.jhl, defpackage.bp, defpackage.nh, defpackage.dj, android.app.Activity
    protected void onCreate(Bundle bundle) {
        if (!getPackageManager().hasSystemFeature("com.google.android.feature.PIXEL_2019_EXPERIENCE") && !this.q.a) {
            ((sgt) s.b().M(2522)).s("Cannot start the Google Camera App on an unsupported device");
            finish();
        }
        t();
        rka.a(this);
        u();
        this.o.f("GcaActivity#onCreate");
        fdq fdqVar = this.v;
        synchronized (fdqVar.a) {
            if (fdqVar.g.a()) {
                fqg fqgVar = fdqVar.h;
                fdqVar.d = fqgVar.b();
                our ourVar = fdqVar.d;
                fsc fscVar = new fsc();
                ourVar.d(fscVar);
                fdqVar.g = fscVar;
                fdqVar.c = fqgVar.c(fdqVar.d);
                our ourVar2 = fdqVar.c;
                fsc fscVar2 = new fsc();
                ourVar2.d(fscVar2);
                fdqVar.f = fscVar2;
                fdqVar.b = fqgVar.a(fdqVar.c);
                our ourVar3 = fdqVar.b;
                fsc fscVar3 = new fsc();
                ourVar3.d(fscVar3);
                fdqVar.e = fscVar3;
            }
        }
        super.onCreate(bundle);
        this.o.g();
    }

    @Override // defpackage.jhl, defpackage.dx, defpackage.bp, android.app.Activity
    protected void onDestroy() {
        u();
        this.o.f("GcaActivity#onDestroy");
        super.onDestroy();
        this.v.et();
        this.o.g();
    }

    @Override // defpackage.jhl, defpackage.nh, android.app.Activity
    protected void onNewIntent(Intent intent) {
        u();
        super.onNewIntent(intent);
    }

    @Override // defpackage.jhl, defpackage.bp, android.app.Activity
    protected void onPause() {
        u();
        this.o.f("GcaActivity#onPause");
        super.onPause();
        this.v.ea();
        this.o.g();
    }

    @Override // defpackage.jhl, defpackage.bp, android.app.Activity
    protected void onResume() {
        u();
        this.o.f("GcaActivity#onResume");
        this.v.eb();
        super.onResume();
        this.o.g();
    }

    @Override // defpackage.jhl, defpackage.dx, defpackage.bp, android.app.Activity
    protected void onStart() {
        u();
        this.o.f("GcaActivity#onStart");
        this.v.ej();
        super.onStart();
        this.o.g();
    }

    @Override // defpackage.jhl, defpackage.dx, defpackage.bp, android.app.Activity
    protected void onStop() {
        u();
        this.o.f("GcaActivity#onStop");
        super.onStop();
        this.v.eu();
        this.o.g();
    }

    protected final pbn q() {
        t();
        return this.o;
    }

    protected final iso r() {
        if (this.w == null) {
            synchronized (this.t) {
                if (this.w == null) {
                    this.w = new iso(this);
                }
            }
        }
        return this.w;
    }

    protected gox s() {
        t();
        if (this.z == null) {
            synchronized (this.t) {
                if (this.z == null) {
                    jgt jgtVar = this.x;
                    ins insVar = this.y;
                    jgtVar.k(this.p);
                    jgt jgtVar2 = this.x;
                    t();
                    this.z = new gox(this, jgtVar2, insVar, this.v);
                }
            }
        }
        return this.z;
    }
}

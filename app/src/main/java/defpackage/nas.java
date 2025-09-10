package defpackage;

import android.content.Context;
import com.google.ar.core.R;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nas {
    public final owf a;
    public final luk b;
    public final Context c;
    public final Executor d;
    public final String e;
    public final String f;
    public nan g;
    public nan h;
    public nan i;
    public nan j;
    public boolean k = false;
    public final imi l;
    public final fdq m;

    public nas(Context context, owf owfVar, luk lukVar, imi imiVar, Executor executor, fdq fdqVar) {
        this.a = owfVar;
        this.b = lukVar;
        this.l = imiVar;
        this.c = context;
        this.m = fdqVar;
        this.e = context.getResources().getString(R.string.face_retouching_on_light);
        this.f = context.getResources().getString(R.string.face_retouching_on_strong);
        this.d = executor;
    }

    public final void a() {
        nan nanVar = this.j;
        if (nanVar != null) {
            this.l.f(nanVar);
        }
    }

    public final void b() {
        this.l.f(this.h);
    }

    public final void c() {
        if (this.k) {
            this.k = false;
            this.l.a(this.i);
        }
    }

    public final void d() {
        this.l.a(this.h);
    }
}

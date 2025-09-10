package defpackage;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ey extends ff implements fz {
    public final gb a;
    public fe b;
    final /* synthetic */ ez c;
    private final Context f;
    private WeakReference g;

    public ey(ez ezVar, Context context, fe feVar) {
        this.c = ezVar;
        this.f = context;
        this.b = feVar;
        gb gbVar = new gb(context);
        gbVar.D();
        this.a = gbVar;
        gbVar.b = this;
    }

    @Override // defpackage.fz
    public final void D(gb gbVar) {
        if (this.b == null) {
            return;
        }
        g();
        this.c.d.o();
    }

    @Override // defpackage.fz
    public final boolean H(gb gbVar, MenuItem menuItem) {
        fe feVar = this.b;
        if (feVar != null) {
            return feVar.b(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.ff
    public final Menu a() {
        return this.a;
    }

    @Override // defpackage.ff
    public final MenuInflater b() {
        return new fl(this.f);
    }

    @Override // defpackage.ff
    public final View c() {
        WeakReference weakReference = this.g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.ff
    public final CharSequence d() {
        return this.c.d.h;
    }

    @Override // defpackage.ff
    public final CharSequence e() {
        return this.c.d.g;
    }

    @Override // defpackage.ff
    public final void f() {
        ez ezVar = this.c;
        if (ezVar.f != this) {
            return;
        }
        if (ez.y(ezVar.k, false)) {
            this.b.a(this);
        } else {
            ezVar.g = this;
            ezVar.h = this.b;
        }
        this.b = null;
        ezVar.v(false);
        ActionBarContextView actionBarContextView = ezVar.d;
        if (actionBarContextView.i == null) {
            actionBarContextView.i();
        }
        ezVar.b.k(ezVar.m);
        ezVar.f = null;
    }

    @Override // defpackage.ff
    public final void g() {
        if (this.c.f != this) {
            return;
        }
        gb gbVar = this.a;
        gbVar.s();
        try {
            this.b.d(this, gbVar);
        } finally {
            this.a.r();
        }
    }

    @Override // defpackage.ff
    public final void h(View view) {
        this.c.d.j(view);
        this.g = new WeakReference(view);
    }

    @Override // defpackage.ff
    public final void i(int i) {
        j(this.c.a.getResources().getString(i));
    }

    @Override // defpackage.ff
    public final void j(CharSequence charSequence) {
        this.c.d.k(charSequence);
    }

    @Override // defpackage.ff
    public final void k(int i) {
        l(this.c.a.getResources().getString(i));
    }

    @Override // defpackage.ff
    public final void l(CharSequence charSequence) {
        this.c.d.l(charSequence);
    }

    @Override // defpackage.ff
    public final void m(boolean z) {
        this.e = z;
        this.c.d.m(z);
    }

    @Override // defpackage.ff
    public final boolean n() {
        return this.c.d.j;
    }
}

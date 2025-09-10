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
public final class fg extends ff implements fz {
    public final gb a;
    private final Context b;
    private final ActionBarContextView c;
    private final fe f;
    private WeakReference g;
    private boolean h;

    public fg(Context context, ActionBarContextView actionBarContextView, fe feVar) {
        this.b = context;
        this.c = actionBarContextView;
        this.f = feVar;
        gb gbVar = new gb(actionBarContextView.getContext());
        gbVar.D();
        this.a = gbVar;
        gbVar.b = this;
    }

    @Override // defpackage.fz
    public final void D(gb gbVar) {
        g();
        this.c.o();
    }

    @Override // defpackage.fz
    public final boolean H(gb gbVar, MenuItem menuItem) {
        return this.f.b(this, menuItem);
    }

    @Override // defpackage.ff
    public final Menu a() {
        return this.a;
    }

    @Override // defpackage.ff
    public final MenuInflater b() {
        return new fl(this.c.getContext());
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
        return this.c.h;
    }

    @Override // defpackage.ff
    public final CharSequence e() {
        return this.c.g;
    }

    @Override // defpackage.ff
    public final void f() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f.a(this);
    }

    @Override // defpackage.ff
    public final void g() {
        this.f.d(this, this.a);
    }

    @Override // defpackage.ff
    public final void h(View view) {
        this.c.j(view);
        this.g = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.ff
    public final void i(int i) {
        j(this.b.getString(i));
    }

    @Override // defpackage.ff
    public final void j(CharSequence charSequence) {
        this.c.k(charSequence);
    }

    @Override // defpackage.ff
    public final void k(int i) {
        l(this.b.getString(i));
    }

    @Override // defpackage.ff
    public final void l(CharSequence charSequence) {
        this.c.l(charSequence);
    }

    @Override // defpackage.ff
    public final void m(boolean z) {
        this.e = z;
        this.c.m(z);
    }

    @Override // defpackage.ff
    public final boolean n() {
        return this.c.j;
    }
}

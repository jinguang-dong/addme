package defpackage;

import android.content.Context;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.wear.ambient.AmbientMode;
import com.google.ar.core.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eu extends dm {
    public final Window.Callback a;
    boolean b;
    public final mi c;
    public final AmbientMode.AmbientController d;
    private boolean e;
    private boolean f;
    private final ArrayList g = new ArrayList();
    private final Runnable h = new av(this, 11, null);
    private final AmbientMode.AmbientController i;

    public eu(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        AmbientMode.AmbientController ambientController = new AmbientMode.AmbientController(this);
        this.i = ambientController;
        mi miVar = new mi(toolbar, false);
        this.c = miVar;
        coe.d(callback);
        this.a = callback;
        miVar.d = callback;
        toolbar.D = ambientController;
        miVar.i(charSequence);
        this.d = new AmbientMode.AmbientController(this);
    }

    @Override // defpackage.dm
    public final int a() {
        return this.c.b;
    }

    @Override // defpackage.dm
    public final Context b() {
        return this.c.a();
    }

    @Override // defpackage.dm
    public final void d(boolean z) {
        if (z == this.f) {
            return;
        }
        this.f = z;
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((dl) arrayList.get(i)).a();
        }
    }

    @Override // defpackage.dm
    public final void e() {
        this.c.a.removeCallbacks(this.h);
    }

    @Override // defpackage.dm
    public final void g(boolean z) {
        w(4, 4);
    }

    @Override // defpackage.dm
    public final void i(CharSequence charSequence) {
        this.c.g(charSequence);
    }

    @Override // defpackage.dm
    public final void j(CharSequence charSequence) {
        this.c.i(charSequence);
    }

    @Override // defpackage.dm
    public final boolean k() {
        return this.c.k();
    }

    @Override // defpackage.dm
    public final boolean l() {
        mi miVar = this.c;
        if (!miVar.j()) {
            return false;
        }
        miVar.b();
        return true;
    }

    @Override // defpackage.dm
    public final boolean m() {
        Toolbar toolbar = this.c.a;
        Runnable runnable = this.h;
        toolbar.removeCallbacks(runnable);
        int[] iArr = con.a;
        toolbar.postOnAnimation(runnable);
        return true;
    }

    @Override // defpackage.dm
    public final boolean n(int i, KeyEvent keyEvent) {
        Menu menuV = v();
        if (menuV == null) {
            return false;
        }
        menuV.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuV.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.dm
    public final boolean o(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            p();
        }
        return true;
    }

    @Override // defpackage.dm
    public final boolean p() {
        return this.c.m();
    }

    @Override // defpackage.dm
    public final void r() {
        w(2, 2);
    }

    @Override // defpackage.dm
    public final void s() {
        w(8, 8);
    }

    @Override // defpackage.dm
    public final void t() {
        this.c.e(null);
    }

    @Override // defpackage.dm
    public final void u() {
        mi miVar = this.c;
        miVar.g(miVar.a().getText(R.string.pref_camera_settings_category));
    }

    public final Menu v() {
        if (!this.e) {
            mi miVar = this.c;
            et etVar = new et(this);
            hk hkVar = new hk(this, 1);
            Toolbar toolbar = miVar.a;
            toolbar.z = etVar;
            toolbar.A = hkVar;
            ActionMenuView actionMenuView = toolbar.a;
            if (actionMenuView != null) {
                actionMenuView.i(etVar, hkVar);
            }
            this.e = true;
        }
        return this.c.a.f();
    }

    public final void w(int i, int i2) {
        mi miVar = this.c;
        miVar.d((i & i2) | (miVar.b & (~i2)));
    }

    @Override // defpackage.dm
    public final void q() {
    }

    @Override // defpackage.dm
    public final void f(boolean z) {
    }

    @Override // defpackage.dm
    public final void h(boolean z) {
    }
}

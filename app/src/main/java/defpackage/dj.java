package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dj extends Activity implements cwh, cnr {
    public final cwc f;

    public dj() {
        new aaa((byte[]) null);
        this.f = new cwc(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        getWindow().getDecorView().getClass();
        int[] iArr = con.a;
        return coi.D(this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        getWindow().getDecorView().getClass();
        int[] iArr = con.a;
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // defpackage.cnr
    public final boolean g(KeyEvent keyEvent) {
        keyEvent.getClass();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.cwh
    public final cwc getLifecycle() {
        return this.f;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = cxa.a;
        cok.h(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        this.f.d(cwb.c);
        super.onSaveInstanceState(bundle);
    }
}

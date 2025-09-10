package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class bb extends bm implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private Handler ag;
    private boolean an;
    private boolean ap;
    private boolean aq;
    private boolean ar;
    public Dialog c;
    private final Runnable ah = new av(this, 3, null);
    private final DialogInterface.OnCancelListener ai = new ay(this);
    public final DialogInterface.OnDismissListener a = new fdx(this, 1);
    private int aj = 0;
    private int ak = 0;
    private boolean al = true;
    public boolean b = true;
    private int am = -1;
    private final cwr ao = new az(this);
    public boolean d = false;

    public final void c(ch chVar, String str) {
        this.aq = false;
        this.ar = true;
        ai aiVar = new ai(chVar);
        aiVar.p();
        aiVar.n(this, str);
        aiVar.h();
    }

    public final void d(ch chVar, String str) {
        this.aq = false;
        this.ar = true;
        ai aiVar = new ai(chVar);
        aiVar.p();
        aiVar.n(this, str);
        aiVar.c();
    }

    @Override // defpackage.bm
    public final br dB() {
        return new ba(this, new be(this));
    }

    public final void e(boolean z, boolean z2) {
        if (this.aq) {
            return;
        }
        this.aq = true;
        this.ar = false;
        Dialog dialog = this.c;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.c.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.ag.getLooper()) {
                    onDismiss(this.c);
                } else {
                    this.ag.post(this.ah);
                }
            }
        }
        this.ap = true;
        if (this.am >= 0) {
            ch parentFragmentManager = getParentFragmentManager();
            int i = this.am;
            if (i < 0) {
                throw new IllegalArgumentException(a.bv(i, "Bad id: "));
            }
            parentFragmentManager.G(new cf(parentFragmentManager, i), z);
            this.am = -1;
            return;
        }
        ai aiVar = new ai(getParentFragmentManager());
        aiVar.p();
        aiVar.k(this);
        if (z) {
            aiVar.i();
        } else {
            aiVar.h();
        }
    }

    public Dialog f() {
        if (ch.X(3)) {
            toString();
        }
        return new ni(requireContext(), this.ak);
    }

    @Override // defpackage.bm
    public final void fh(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.fh(layoutInflater, viewGroup, bundle);
        if (this.P != null || this.c == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.c.onRestoreInstanceState(bundle2);
    }

    @Override // defpackage.bm
    public final void onAttach(Context context) {
        super.onAttach(context);
        cwq cwqVar = this.aa;
        cwp.b("observeForever");
        cwr cwrVar = this.ao;
        cwm cwmVar = new cwm(cwqVar, cwrVar);
        cwo cwoVar = (cwo) cwqVar.c.f(cwrVar, cwmVar);
        if (cwoVar instanceof cwn) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cwoVar == null) {
            cwmVar.d(true);
        }
        if (this.ar) {
            return;
        }
        this.aq = false;
    }

    @Override // defpackage.bm
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.ag = new Handler();
        this.b = this.F == 0;
        if (bundle != null) {
            this.aj = bundle.getInt("android:style", 0);
            this.ak = bundle.getInt("android:theme", 0);
            this.al = bundle.getBoolean("android:cancelable", true);
            this.b = bundle.getBoolean("android:showsDialog", this.b);
            this.am = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // defpackage.bm
    public final void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.c;
        if (dialog != null) {
            this.ap = true;
            dialog.setOnDismissListener(null);
            this.c.dismiss();
            if (!this.aq) {
                onDismiss(this.c);
            }
            this.c = null;
            this.d = false;
        }
    }

    @Override // defpackage.bm
    public final void onDetach() {
        super.onDetach();
        if (!this.ar && !this.aq) {
            this.aq = true;
        }
        this.aa.g(this.ao);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.ap) {
            return;
        }
        if (ch.X(3)) {
            toString();
        }
        e(true, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0041 A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:10:0x0015, B:12:0x0021, B:22:0x0039, B:24:0x0041, B:25:0x0048, B:18:0x002b, B:20:0x0031, B:21:0x0036, B:26:0x0060), top: B:42:0x0015 }] */
    @Override // defpackage.bm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle r7) {
        /*
            r6 = this;
            android.view.LayoutInflater r7 = r6.getLayoutInflater(r7)
            boolean r0 = r6.b
            r1 = 2
            if (r0 == 0) goto L80
            boolean r0 = r6.an
            if (r0 == 0) goto Lf
            goto L80
        Lf:
            boolean r0 = r6.d
            if (r0 != 0) goto L6a
            r0 = 0
            r2 = 1
            r6.an = r2     // Catch: java.lang.Throwable -> L66
            android.app.Dialog r3 = r6.f()     // Catch: java.lang.Throwable -> L66
            r6.c = r3     // Catch: java.lang.Throwable -> L66
            boolean r4 = r6.b     // Catch: java.lang.Throwable -> L66
            if (r4 == 0) goto L60
            int r4 = r6.aj     // Catch: java.lang.Throwable -> L66
            if (r4 == r2) goto L36
            if (r4 == r1) goto L36
            r5 = 3
            if (r4 == r5) goto L2b
            goto L39
        L2b:
            android.view.Window r4 = r3.getWindow()     // Catch: java.lang.Throwable -> L66
            if (r4 == 0) goto L36
            r5 = 24
            r4.addFlags(r5)     // Catch: java.lang.Throwable -> L66
        L36:
            r3.requestWindowFeature(r2)     // Catch: java.lang.Throwable -> L66
        L39:
            android.content.Context r3 = r6.getContext()     // Catch: java.lang.Throwable -> L66
            boolean r4 = r3 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L66
            if (r4 == 0) goto L48
            android.app.Dialog r4 = r6.c     // Catch: java.lang.Throwable -> L66
            android.app.Activity r3 = (android.app.Activity) r3     // Catch: java.lang.Throwable -> L66
            r4.setOwnerActivity(r3)     // Catch: java.lang.Throwable -> L66
        L48:
            android.app.Dialog r3 = r6.c     // Catch: java.lang.Throwable -> L66
            boolean r4 = r6.al     // Catch: java.lang.Throwable -> L66
            r3.setCancelable(r4)     // Catch: java.lang.Throwable -> L66
            android.app.Dialog r3 = r6.c     // Catch: java.lang.Throwable -> L66
            android.content.DialogInterface$OnCancelListener r4 = r6.ai     // Catch: java.lang.Throwable -> L66
            r3.setOnCancelListener(r4)     // Catch: java.lang.Throwable -> L66
            android.app.Dialog r3 = r6.c     // Catch: java.lang.Throwable -> L66
            android.content.DialogInterface$OnDismissListener r4 = r6.a     // Catch: java.lang.Throwable -> L66
            r3.setOnDismissListener(r4)     // Catch: java.lang.Throwable -> L66
            r6.d = r2     // Catch: java.lang.Throwable -> L66
            goto L63
        L60:
            r2 = 0
            r6.c = r2     // Catch: java.lang.Throwable -> L66
        L63:
            r6.an = r0
            goto L6a
        L66:
            r7 = move-exception
            r6.an = r0
            throw r7
        L6a:
            boolean r0 = defpackage.ch.X(r1)
            if (r0 == 0) goto L73
            r6.toString()
        L73:
            android.app.Dialog r6 = r6.c
            if (r6 == 0) goto L89
            android.content.Context r6 = r6.getContext()
            android.view.LayoutInflater r6 = r7.cloneInContext(r6)
            return r6
        L80:
            boolean r0 = defpackage.ch.X(r1)
            if (r0 == 0) goto L89
            r6.toString()
        L89:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bb.onGetLayoutInflater(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // defpackage.bm
    public void onSaveInstanceState(Bundle bundle) {
        Dialog dialog = this.c;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.aj;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.ak;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        if (!this.al) {
            bundle.putBoolean("android:cancelable", false);
        }
        if (!this.b) {
            bundle.putBoolean("android:showsDialog", false);
        }
        int i3 = this.am;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // defpackage.bm
    public final void onStart() {
        super.onStart();
        Dialog dialog = this.c;
        if (dialog != null) {
            this.ap = false;
            dialog.show();
            View decorView = this.c.getWindow().getDecorView();
            col.f(decorView, this);
            col.d(decorView, this);
            coe.i(decorView, this);
        }
    }

    @Override // defpackage.bm
    public final void onStop() {
        super.onStop();
        Dialog dialog = this.c;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // defpackage.bm
    public final void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.c == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.c.onRestoreInstanceState(bundle2);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}

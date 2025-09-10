package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class eq extends ni {
    private dz a;
    private final cnr b;

    public eq(Context context, int i) {
        super(context, a(context, i));
        this.b = new cnr() { // from class: ep
            @Override // defpackage.cnr
            public final boolean g(KeyEvent keyEvent) {
                return this.a.c(keyEvent);
            }
        };
        dz dzVarB = b();
        ((eo) dzVarB).D = a(context, i);
        dzVarB.o();
    }

    private static int a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    private final void g() {
        col.f(getWindow().getDecorView(), this);
        coe.i(getWindow().getDecorView(), this);
        byi.bE(getWindow().getDecorView(), this);
    }

    @Override // defpackage.ni, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g();
        b().d(view, layoutParams);
    }

    public final dz b() {
        if (this.a == null) {
            int i = dz.b;
            this.a = new eo(getContext(), getWindow(), this);
        }
        return this.a;
    }

    final boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void d() {
        b().p(1);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        b().g();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        return coi.D(this.b, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        return b().c(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        b().f();
    }

    @Override // defpackage.ni, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        b().e();
        super.onCreate(bundle);
        b().o();
    }

    @Override // defpackage.ni, android.app.Dialog
    protected final void onStop() {
        super.onStop();
        b().h();
    }

    @Override // defpackage.ni, android.app.Dialog
    public void setContentView(int i) {
        g();
        b().j(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        b().m(getContext().getString(i));
    }

    @Override // defpackage.ni, android.app.Dialog
    public void setContentView(View view) {
        g();
        b().k(view);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        b().m(charSequence);
    }

    @Override // defpackage.ni, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g();
        b().l(view, layoutParams);
    }
}

package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ni extends Dialog implements cwh, nv, deu {
    private final nu a;
    private cwc b;
    private final byz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni(Context context, int i) {
        super(context, i);
        context.getClass();
        this.c = coe.k(this);
        this.a = new nu(new mb(this, 4));
    }

    private final cwc a() {
        cwc cwcVar = this.b;
        if (cwcVar != null) {
            return cwcVar;
        }
        cwc cwcVar2 = new cwc(this);
        this.b = cwcVar2;
        return cwcVar2;
    }

    public static final void f(ni niVar) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        e();
        super.addContentView(view, layoutParams);
    }

    public final void e() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        col.f(decorView, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        byi.bE(decorView2, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        coe.i(decorView3, this);
    }

    @Override // defpackage.cwh
    public final cwc getLifecycle() {
        return a();
    }

    @Override // defpackage.deu
    public final det getSavedStateRegistry() {
        return (det) this.c.a;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.a.d();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.getClass();
        this.a.e(onBackInvokedDispatcher);
        this.c.X(bundle);
        a().b(cwa.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.c.Y(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        a().b(cwa.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        a().b(cwa.ON_DESTROY);
        this.b = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        e();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        e();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        e();
        super.setContentView(view, layoutParams);
    }
}

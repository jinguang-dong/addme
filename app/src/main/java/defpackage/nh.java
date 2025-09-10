package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import com.google.android.clockwork.common.wearable.wearmaterial.list.CaNf.PJGqOKsIpSdZ;
import com.google.android.gms.wearable.aXYS.zflNUOOzDfM;
import com.google.ar.core.R;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nh extends dj implements cwh, cxt, cvw, deu, nv, oh, clw, clx, dc, dd, cns {
    private final ues a;
    private final CopyOnWriteArrayList b;
    private final CopyOnWriteArrayList c;
    private boolean d;
    private boolean e;
    public final og h;
    public final CopyOnWriteArrayList i;
    public final CopyOnWriteArrayList j;
    public final CopyOnWriteArrayList k;
    public final CopyOnWriteArrayList l;
    public final nf m;
    private cxb q;
    private final byz r;
    private final ues zj;
    private final ues zk;
    public final ny g = new ny();
    public final got n = new got(new ea(this, 4, null));

    public nh() {
        byz byzVarK = coe.k(this);
        this.r = byzVarK;
        this.m = new nf(this);
        int i = 1;
        this.a = new uez(new ne(this, i));
        new AtomicInteger();
        this.h = new og(this);
        this.b = new CopyOnWriteArrayList();
        this.i = new CopyOnWriteArrayList();
        this.j = new CopyOnWriteArrayList();
        this.k = new CopyOnWriteArrayList();
        this.l = new CopyOnWriteArrayList();
        this.c = new CopyOnWriteArrayList();
        cwc cwcVar = this.f;
        if (cwcVar == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        cwcVar.a(new nd(this, i));
        int i2 = 0;
        this.f.a(new nd(this, i2));
        int i3 = 2;
        this.f.a(new nd(this, 2, null));
        byzVarK.W();
        cxf.c(this);
        getSavedStateRegistry().b("android:support:activity-result", new bw(this, 3));
        l(new dw(this, i3));
        this.zj = new uez(new ne(this, i2));
        this.zk = new uez(new ne(this, i3));
    }

    public static final void o(nh nhVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!a.ao(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!a.ao(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        n();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.m.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.oh
    public final og eq() {
        throw null;
    }

    @Override // defpackage.clw
    public final void er(cnh cnhVar) {
        cnhVar.getClass();
        this.b.add(cnhVar);
    }

    @Override // defpackage.clw
    public final void f(cnh cnhVar) {
        cnhVar.getClass();
        this.b.remove(cnhVar);
    }

    @Override // defpackage.cvw
    public final cxy getDefaultViewModelCreationExtras() {
        cxz cxzVar = new cxz((byte[]) null);
        if (getApplication() != null) {
            cxzVar.b(cxo.b, getApplication());
        }
        cxzVar.b(cxf.a, this);
        cxzVar.b(cxf.b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            cxzVar.b(cxf.c, extras);
        }
        return cxzVar;
    }

    @Override // defpackage.cvw
    public final cxp getDefaultViewModelProviderFactory() {
        return (cxp) this.zj.a();
    }

    @Override // defpackage.deu
    public final det getSavedStateRegistry() {
        return (det) this.r.a;
    }

    @Override // defpackage.cxt
    public final cxb getViewModelStore$ar$class_merging() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        m();
        cxb cxbVar = this.q;
        cxbVar.getClass();
        return cxbVar;
    }

    public final nu j() {
        return (nu) this.zk.a();
    }

    public final void k(final nu nuVar) {
        this.f.a(new cwf() { // from class: nc
            @Override // defpackage.cwf
            public final void a(cwh cwhVar, cwa cwaVar) {
                if (cwaVar == cwa.ON_CREATE) {
                    nh nhVar = this;
                    nu nuVar2 = nuVar;
                    OnBackInvokedDispatcher onBackInvokedDispatcher = nhVar.getOnBackInvokedDispatcher();
                    onBackInvokedDispatcher.getClass();
                    nuVar2.e(onBackInvokedDispatcher);
                }
            }
        });
    }

    public final void l(nz nzVar) {
        ny nyVar = this.g;
        if (nyVar.b != null) {
            nzVar.a();
        }
        nyVar.a.add(nzVar);
    }

    public final void m() {
        if (this.q == null) {
            sgh sghVar = (sgh) getLastNonConfigurationInstance();
            if (sghVar != null) {
                this.q = (cxb) sghVar.a;
            }
            if (this.q == null) {
                this.q = new cxb((byte[]) null);
            }
        }
    }

    public final void n() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        col.f(decorView, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        col.d(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        coe.i(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        byi.bE(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
    }

    @Override // android.app.Activity
    @ueo
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (this.h.f(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    @ueo
    public void onBackPressed() {
        j().d();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.b.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((cnh) it.next()).accept(configuration);
        }
    }

    @Override // defpackage.dj, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.r.X(bundle);
        ny nyVar = this.g;
        nyVar.b = this;
        Iterator it = nyVar.a.iterator();
        while (it.hasNext()) {
            ((nz) it.next()).a();
        }
        super.onCreate(bundle);
        int i = cxa.a;
        cok.h(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(0, menu);
        this.n.p(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.n.r(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    @ueo
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.d) {
            return;
        }
        Iterator it = this.k.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((cnh) it.next()).accept(new cnf(z));
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.j.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((cnh) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.n.a).iterator();
        while (it.hasNext()) {
            ((ch) ((rnu) it.next()).a).w(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    @ueo
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.e) {
            return;
        }
        Iterator it = this.l.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((cnh) it.next()).accept(new cnf(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(0, view, menu);
        this.n.q(menu);
        return true;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        sgh sghVar;
        Object obj = this.q;
        if (obj == null && (sghVar = (sgh) getLastNonConfigurationInstance()) != null) {
            obj = sghVar.a;
        }
        if (obj == null) {
            return null;
        }
        sgh sghVar2 = new sgh();
        sghVar2.a = obj;
        return sghVar2;
    }

    @Override // defpackage.dj, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        cwc cwcVar = this.f;
        if (cwcVar instanceof cwc) {
            cwcVar.getClass();
            cwcVar.d(cwb.c);
        }
        super.onSaveInstanceState(bundle);
        this.r.Y(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.i.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((cnh) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.c.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final qwz p() {
        return (qwz) this.a.a();
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (Trace.isEnabled()) {
                coh.j("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            qwz qwzVarP = p();
            synchronized (qwzVarP.c) {
                qwzVarP.b = true;
                ?? r3 = qwzVarP.d;
                Iterator it = r3.iterator();
                while (it.hasNext()) {
                    ((uif) it.next()).a();
                }
                r3.clear();
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        n();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.m.a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @ueo
    public void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @ueo
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    @ueo
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (!this.h.f(i, -1, new Intent().putExtra(zflNUOOzDfM.ygn, strArr).putExtra(PJGqOKsIpSdZ.RRxcX, iArr))) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    @ueo
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @ueo
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.d = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.d = false;
            Iterator it = this.k.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((cnh) it.next()).accept(new cnf(z));
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.e = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.e = false;
            Iterator it = this.l.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((cnh) it.next()).accept(new cnf(z));
            }
        } catch (Throwable th) {
            this.e = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        n();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.m.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        n();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.m.a(decorView);
        super.setContentView(view, layoutParams);
    }
}

package com.google.android.apps.camera.legacy.app.settings;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.camera.legacy.app.app.CameraApp;
import com.google.android.apps.camera.ui.preference.ManagedSwitchPreferenceCompat;
import com.google.ar.core.R;
import defpackage.ai;
import defpackage.dbe;
import defpackage.ejt;
import defpackage.eob;
import defpackage.fdq;
import defpackage.fqg;
import defpackage.hbj;
import defpackage.hbp;
import defpackage.hfi;
import defpackage.izm;
import defpackage.izo;
import defpackage.jak;
import defpackage.jcy;
import defpackage.jdf;
import defpackage.jdg;
import defpackage.jdh;
import defpackage.jdl;
import defpackage.jgj;
import defpackage.jgo;
import defpackage.jgt;
import defpackage.jod;
import defpackage.luf;
import defpackage.luj;
import defpackage.luk;
import defpackage.mdy;
import defpackage.mgf;
import defpackage.mgp;
import defpackage.no;
import defpackage.nu;
import defpackage.obu;
import defpackage.on;
import defpackage.out;
import defpackage.owq;
import defpackage.pfl;
import defpackage.pkc;
import defpackage.rwc;
import defpackage.sfd;
import defpackage.tzj;
import defpackage.tzs;
import defpackage.tzx;
import defpackage.ujp;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CameraGm3SettingsActivity extends eob {
    public jdh o;
    public jdf p;
    public jgj q;
    public fqg r;
    private no t;
    private jdl u;
    private boolean v;
    private fdq x;
    private jod y;
    private final Object w = new Object();
    public final jgt s = new jgt();

    private final void h() {
        if (this.v) {
            return;
        }
        synchronized (this.w) {
            if (!this.v) {
                Context applicationContext = getApplicationContext();
                applicationContext.getClass();
                izm izmVarG = ((CameraApp) applicationContext).g();
                this.r = (fqg) izmVarG.gT.a();
                this.q = jgo.c(izmVarG.zf);
                this.v = true;
            }
        }
    }

    @Override // defpackage.dj, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        if (this.s.F()) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.s.B(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    public final void finish() {
        this.s.l();
        super.finish();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.s.m();
        super.onActionModeFinished(actionMode);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.s.n();
        super.onActionModeStarted(actionMode);
    }

    @Override // defpackage.bp, defpackage.nh, android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        this.s.H(i, i2);
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.s.o();
        super.onAttachedToWindow();
    }

    @Override // defpackage.eob, defpackage.nh, android.app.Activity
    public final void onBackPressed() {
        j().d();
    }

    @Override // defpackage.nh, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        this.s.p(configuration);
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public final boolean onContextItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        return this.s.I();
    }

    @Override // defpackage.eob, defpackage.bp, defpackage.nh, defpackage.dj, android.app.Activity
    protected final void onCreate(Bundle bundle) throws Exception {
        jgt jgtVar = this.s;
        jgtVar.c(bundle);
        h();
        ComponentCallbacks2 application = getApplication();
        application.getClass();
        izm izmVarG = ((jak) application).g();
        izmVarG.getClass();
        super.onCreate(bundle);
        h();
        no noVar = null;
        if (this.y == null) {
            synchronized (this.w) {
                if (this.y == null) {
                    jgj jgjVar = this.q;
                    if (jgjVar == null) {
                        ujp.c("appLifecycle");
                        jgjVar = null;
                    }
                    jgtVar.k(jgjVar);
                    fqg fqgVar = this.r;
                    if (fqgVar == null) {
                        ujp.c("appLifetime");
                        fqgVar = null;
                    }
                    this.x = fdq.h(fqgVar);
                    this.y = new jod(jgtVar, this.x);
                }
            }
        }
        jod jodVar = this.y;
        jodVar.getClass();
        izo izoVar = new izo(izmVarG.a, jodVar, new ejt(this, (byte[]) null));
        if (this.o == null) {
            izm izmVar = izoVar.a;
            pkc pkcVar = (pkc) izmVar.im.a();
            hbj hbjVar = (hbj) izmVar.o.a();
            pfl pflVar = (pfl) izmVar.we.a();
            luj lujVar = (luj) izmVar.eZ.a();
            luj lujVar2 = (luj) izmVar.eZ.a();
            AccessibilityManager accessibilityManagerI = izmVar.i();
            owq owqVar = (owq) izmVar.uI.a();
            sfd sfdVar = sfd.a;
            this.o = new jdh(pkcVar, hbjVar, pflVar, lujVar, lujVar2, accessibilityManagerI, owqVar, sfdVar, sfdVar, sfdVar);
        }
        jdh jdhVar = this.o;
        jdhVar.getClass();
        jdhVar.b(this);
        if (this.p == null) {
            izm izmVar2 = izoVar.a;
            ejt ejtVar = izoVar.w;
            Context contextD = jdg.d(ejtVar);
            hfi hfiVar = new hfi(contextD);
            Context contextD2 = jdg.d(ejtVar);
            ((hbj) izmVar2.o.a()).getClass();
            dbe.c(new on(contextD2, R.style.Theme_CameraSettings)).getClass();
            new ArrayList();
            mdy mdyVar = (mdy) izmVar2.O.a();
            owq owqVar2 = (owq) izmVar2.lF.a();
            owq owqVar3 = (owq) izmVar2.ke.a();
            mdy mdyVar2 = (mdy) izmVar2.O.a();
            Context context = (Context) izmVar2.yV.b;
            hbp hbpVar = new hbp(context, owqVar3, mdyVar2);
            mgf mgfVar = new mgf(izoVar.a(), (mgp) izmVar2.oT.a(), izoVar.b(), (ScheduledExecutorService) izmVar2.p.a(), (out) izmVar2.z.a(), (mdy) izmVar2.O.a(), (hbj) izmVar2.o.a());
            izoVar.a();
            izoVar.b();
            obu obuVar = new obu(context, izmVar2.eZ.a());
            tzj tzjVarB = tzs.b(izoVar.d);
            luk lukVar = (luk) izmVar2.eY.a();
            tzx tzxVar = izoVar.l;
            rwc rwcVarK = izmVar2.k();
            rwc rwcVarL = izmVar2.l();
            rwc rwcVarM = izmVar2.m();
            rwc rwcVar = (rwc) izoVar.o.a();
            rwc rwcVar2 = (rwc) izoVar.r.a();
            rwc rwcVar3 = (rwc) izoVar.u.a();
            rwc rwcVarJ = izmVar2.j();
            Optional optional = (Optional) izmVar2.yU.a();
            this.p = new jdf(hfiVar, mdyVar, owqVar2, hbpVar, mgfVar, obuVar, tzjVarB, lukVar, rwcVarK, rwcVarL, rwcVarM, rwcVar, rwcVar2, rwcVar3, rwcVarJ, optional);
        }
        this.u = new jdl();
        ai aiVar = new ai(eo());
        jdl jdlVar = this.u;
        if (jdlVar == null) {
            ujp.c("mainPreferenceFragment");
            jdlVar = null;
        }
        aiVar.q(R.id.content_frame, jdlVar);
        aiVar.h();
        this.t = new jcy(this);
        nu nuVarJ = j();
        no noVar2 = this.t;
        if (noVar2 == null) {
            ujp.c("backPressedCallback");
        } else {
            noVar = noVar2;
        }
        nuVarJ.b(noVar);
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        this.s.J();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        if (this.s.K()) {
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // defpackage.bp, android.app.Activity
    protected final void onDestroy() {
        this.s.q();
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.s.r();
        super.onDetachedFromWindow();
    }

    @Override // android.app.Activity
    public final void onGetDirectActions(CancellationSignal cancellationSignal, Consumer consumer) {
        cancellationSignal.getClass();
        consumer.getClass();
        this.s.L();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.s.D(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.s.M(i)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.s.d();
        super.onLowMemory();
    }

    @Override // defpackage.eob, android.app.Activity
    public final boolean onNavigateUp() {
        j().d();
        return true;
    }

    @Override // defpackage.nh, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        intent.getClass();
        this.s.s(intent);
        super.onNewIntent(intent);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (this.s.N()) {
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // defpackage.bp, android.app.Activity
    protected final void onPause() {
        this.s.t();
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onPerformDirectAction(String str, Bundle bundle, CancellationSignal cancellationSignal, Consumer consumer) {
        str.getClass();
        bundle.getClass();
        cancellationSignal.getClass();
        consumer.getClass();
        this.s.O();
    }

    @Override // android.app.Activity
    protected final void onPostCreate(Bundle bundle) {
        this.s.u(bundle);
        super.onPostCreate(bundle);
    }

    @Override // defpackage.bp, android.app.Activity
    protected final void onPostResume() {
        this.s.v();
        super.onPostResume();
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        if (this.s.P()) {
            return true;
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // defpackage.bp, defpackage.nh, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        this.s.w(i, strArr, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    protected final void onRestoreInstanceState(Bundle bundle) {
        bundle.getClass();
        this.s.x(bundle);
        super.onRestoreInstanceState(bundle);
    }

    @Override // defpackage.bp, android.app.Activity
    protected final void onResume() {
        this.s.e();
        super.onResume();
    }

    @Override // defpackage.nh, defpackage.dj, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        this.s.f(bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override // defpackage.bp, android.app.Activity
    protected final void onStart() {
        this.s.g();
        super.onStart();
    }

    @Override // defpackage.bp, android.app.Activity
    protected final void onStop() {
        this.s.h();
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserInteraction() {
        this.s.y();
        super.onUserInteraction();
    }

    @Override // defpackage.nh, android.app.Activity
    protected final void onUserLeaveHint() {
        this.s.z();
        super.onUserLeaveHint();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.s.A(z);
        super.onWindowFocusChanged(z);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr, int i2) {
        strArr.getClass();
        iArr.getClass();
        super.onRequestPermissionsResult(i, strArr, iArr, i2);
        if (i == 1) {
            for (int i3 : iArr) {
                if (i3 == 0) {
                    jdl jdlVar = this.u;
                    if (jdlVar == null) {
                        ujp.c("mainPreferenceFragment");
                        jdlVar = null;
                    }
                    jdlVar.F().k.j(luf.b.a, true);
                    ManagedSwitchPreferenceCompat managedSwitchPreferenceCompat = jdlVar.ah;
                    if (managedSwitchPreferenceCompat != null) {
                        managedSwitchPreferenceCompat.k(true);
                        return;
                    }
                    return;
                }
            }
        }
    }
}

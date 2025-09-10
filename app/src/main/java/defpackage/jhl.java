package defpackage;

import android.app.Fragment;
import android.content.Intent;
import android.content.pm.PackageManager;
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
import java.lang.reflect.InvocationTargetException;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jhl extends dx {
    private int o;
    private no p;
    protected final jgt x = new jgt();
    protected final ins y = new ins();

    private final void q() {
        this.o--;
    }

    private final void r() {
        int i = this.o;
        this.o = i + 1;
        if (i == 0) {
            this.x.b(new jgf(0));
        }
    }

    @Override // defpackage.dx, defpackage.dj, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.x.F()) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.x.B(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    public final void finish() {
        this.x.l();
        super.finish();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.x.m();
        super.onActionModeFinished(actionMode);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.x.n();
        super.onActionModeStarted(actionMode);
    }

    @Override // defpackage.bp, defpackage.nh, android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        this.x.H(i, i2);
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.x.o();
        super.onAttachedToWindow();
    }

    @Override // defpackage.dx, defpackage.nh, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws PackageManager.NameNotFoundException {
        this.x.p(configuration);
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public final boolean onContextItemSelected(MenuItem menuItem) {
        return this.x.I();
    }

    @Override // defpackage.bp, defpackage.nh, defpackage.dj, android.app.Activity
    protected void onCreate(Bundle bundle) {
        ins insVar = this.y;
        insVar.i();
        this.x.c(bundle);
        super.onCreate(bundle);
        insVar.h();
        this.p = new jhk(this);
        j().b(this.p);
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        this.x.J();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        if (this.x.K()) {
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // defpackage.dx, defpackage.bp, android.app.Activity
    protected void onDestroy() {
        ins insVar = this.y;
        insVar.k();
        this.x.q();
        super.onDestroy();
        insVar.j();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.x.r();
        super.onDetachedFromWindow();
    }

    @Override // android.app.Activity
    public final void onGetDirectActions(CancellationSignal cancellationSignal, Consumer consumer) {
        this.x.L();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.x.D(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.x.M(i)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.x.d();
        super.onLowMemory();
    }

    @Override // defpackage.nh, android.app.Activity
    protected void onNewIntent(Intent intent) {
        this.x.s(intent);
        super.onNewIntent(intent);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.x.N()) {
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // defpackage.bp, android.app.Activity
    protected void onPause() {
        ins insVar = this.y;
        insVar.m();
        this.x.t();
        super.onPause();
        insVar.l();
    }

    @Override // android.app.Activity
    public final void onPerformDirectAction(String str, Bundle bundle, CancellationSignal cancellationSignal, Consumer consumer) {
        this.x.O();
    }

    @Override // defpackage.dx, android.app.Activity
    protected final void onPostCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        this.x.u(bundle);
        super.onPostCreate(bundle);
    }

    @Override // defpackage.dx, defpackage.bp, android.app.Activity
    protected final void onPostResume() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        this.x.v();
        super.onPostResume();
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        if (this.x.P()) {
            return true;
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // defpackage.bp, defpackage.nh, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.x.w(i, strArr, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    protected final void onRestoreInstanceState(Bundle bundle) {
        this.x.x(bundle);
        super.onRestoreInstanceState(bundle);
    }

    @Override // defpackage.bp, android.app.Activity
    protected void onResume() {
        ins insVar = this.y;
        insVar.o();
        this.x.e();
        super.onResume();
        insVar.n();
    }

    @Override // defpackage.nh, defpackage.dj, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        this.x.f(bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override // defpackage.dx, defpackage.bp, android.app.Activity
    protected void onStart() throws PackageManager.NameNotFoundException {
        ins insVar = this.y;
        insVar.q();
        this.x.g();
        super.onStart();
        insVar.p();
        no noVar = this.p;
        noVar.getClass();
        noVar.g(true);
    }

    @Override // defpackage.dx, defpackage.bp, android.app.Activity
    protected void onStop() {
        ins insVar = this.y;
        insVar.s();
        this.x.h();
        super.onStop();
        insVar.r();
    }

    @Override // android.app.Activity
    public final void onUserInteraction() {
        this.x.y();
        super.onUserInteraction();
    }

    @Override // defpackage.nh, android.app.Activity
    protected final void onUserLeaveHint() {
        this.x.z();
        super.onUserLeaveHint();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.x.A(z);
        super.onWindowFocusChanged(z);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        r();
        super.startActivity(intent);
        q();
    }

    @Override // defpackage.nh, android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        r();
        super.startActivityForResult(intent, i);
        q();
    }

    @Override // android.app.Activity
    public final void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        r();
        super.startActivityFromFragment(fragment, intent, i);
        q();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent, Bundle bundle) {
        r();
        super.startActivity(intent, bundle);
        q();
    }

    @Override // defpackage.nh, android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        r();
        super.startActivityForResult(intent, i, bundle);
        q();
    }

    @Override // android.app.Activity
    public final void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        r();
        super.startActivityFromFragment(fragment, intent, i, bundle);
        q();
    }
}

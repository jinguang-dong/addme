package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.ar.core.R;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dx extends bp {
    private dz zi;

    public dx() {
        getSavedStateRegistry().b("androidx:appcompat", new bw(this, 2));
        l(new dw(this, 0));
    }

    private final void es() {
        col.f(getWindow().getDecorView(), this);
        col.d(getWindow().getDecorView(), this);
        coe.i(getWindow().getDecorView(), this);
        byi.bE(getWindow().getDecorView(), this);
    }

    @Override // defpackage.nh, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        es();
        i().d(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        eo eoVar = (eo) i();
        eoVar.A = true;
        int iR = eoVar.r(context, eoVar.q());
        if (eo.n(context) && dz.n(context) && !dz.c) {
            dz.a.execute(new av(context, 9));
        }
        Configuration configuration = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(eoVar.P(context, iR, null, false));
            } catch (IllegalStateException unused) {
            }
        } else if (context instanceof on) {
            try {
                ((on) context).a(eoVar.P(context, iR, null, false));
            } catch (IllegalStateException unused2) {
            }
        } else if (eo.f) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration4 != null && configuration3.diff(configuration4) != 0) {
                    if (configuration3.fontScale != configuration4.fontScale) {
                        configuration.fontScale = configuration4.fontScale;
                    }
                    if (configuration3.mcc != configuration4.mcc) {
                        configuration.mcc = configuration4.mcc;
                    }
                    if (configuration3.mnc != configuration4.mnc) {
                        configuration.mnc = configuration4.mnc;
                    }
                    LocaleList locales = configuration3.getLocales();
                    LocaleList locales2 = configuration4.getLocales();
                    if (!locales.equals(locales2)) {
                        configuration.setLocales(locales2);
                        configuration.locale = configuration4.locale;
                    }
                    if (configuration3.touchscreen != configuration4.touchscreen) {
                        configuration.touchscreen = configuration4.touchscreen;
                    }
                    if (configuration3.keyboard != configuration4.keyboard) {
                        configuration.keyboard = configuration4.keyboard;
                    }
                    if (configuration3.keyboardHidden != configuration4.keyboardHidden) {
                        configuration.keyboardHidden = configuration4.keyboardHidden;
                    }
                    if (configuration3.navigation != configuration4.navigation) {
                        configuration.navigation = configuration4.navigation;
                    }
                    if (configuration3.navigationHidden != configuration4.navigationHidden) {
                        configuration.navigationHidden = configuration4.navigationHidden;
                    }
                    if (configuration3.orientation != configuration4.orientation) {
                        configuration.orientation = configuration4.orientation;
                    }
                    if ((configuration3.screenLayout & 15) != (configuration4.screenLayout & 15)) {
                        configuration.screenLayout |= configuration4.screenLayout & 15;
                    }
                    if ((configuration3.screenLayout & 192) != (configuration4.screenLayout & 192)) {
                        configuration.screenLayout |= configuration4.screenLayout & 192;
                    }
                    if ((configuration3.screenLayout & 48) != (configuration4.screenLayout & 48)) {
                        configuration.screenLayout |= configuration4.screenLayout & 48;
                    }
                    if ((configuration3.screenLayout & 768) != (configuration4.screenLayout & 768)) {
                        configuration.screenLayout |= configuration4.screenLayout & 768;
                    }
                    if ((configuration3.colorMode & 3) != (configuration4.colorMode & 3)) {
                        configuration.colorMode |= configuration4.colorMode & 3;
                    }
                    if ((configuration3.colorMode & 12) != (configuration4.colorMode & 12)) {
                        configuration.colorMode |= configuration4.colorMode & 12;
                    }
                    if ((configuration3.uiMode & 15) != (configuration4.uiMode & 15)) {
                        configuration.uiMode |= configuration4.uiMode & 15;
                    }
                    if ((configuration3.uiMode & 48) != (configuration4.uiMode & 48)) {
                        configuration.uiMode |= configuration4.uiMode & 48;
                    }
                    if (configuration3.screenWidthDp != configuration4.screenWidthDp) {
                        configuration.screenWidthDp = configuration4.screenWidthDp;
                    }
                    if (configuration3.screenHeightDp != configuration4.screenHeightDp) {
                        configuration.screenHeightDp = configuration4.screenHeightDp;
                    }
                    if (configuration3.smallestScreenWidthDp != configuration4.smallestScreenWidthDp) {
                        configuration.smallestScreenWidthDp = configuration4.smallestScreenWidthDp;
                    }
                    if (configuration3.densityDpi != configuration4.densityDpi) {
                        configuration.densityDpi = configuration4.densityDpi;
                    }
                }
            }
            Configuration configurationP = eoVar.P(context, iR, configuration, true);
            on onVar = new on(context, R.style.Theme_AppCompat_Empty);
            onVar.a(configurationP);
            try {
                if (context.getTheme() != null) {
                    onVar.getTheme().rebase();
                }
            } catch (NullPointerException unused3) {
            }
            context = onVar;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        dm dmVarH = h();
        if (getWindow().hasFeature(0)) {
            if (dmVarH == null || !dmVarH.k()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // defpackage.dj, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        dm dmVarH = h();
        if (keyCode == 82 && dmVarH != null && dmVarH.o(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        return i().c(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        eo eoVar = (eo) i();
        if (eoVar.l == null) {
            eoVar.C();
            dm dmVar = eoVar.k;
            eoVar.l = new fl(dmVar != null ? dmVar.b() : eoVar.h);
        }
        return eoVar.l;
    }

    public final dm h() {
        return i().b();
    }

    public final dz i() {
        if (this.zi == null) {
            int i = dz.b;
            this.zi = new eo(this, null, this);
        }
        return this.zi;
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        i().f();
    }

    @Override // defpackage.nh, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) throws PackageManager.NameNotFoundException {
        dm dmVarB;
        super.onConfigurationChanged(configuration);
        eo eoVar = (eo) i();
        if (eoVar.u && eoVar.s && (dmVarB = eoVar.b()) != null) {
            dmVarB.q();
        }
        Context context = eoVar.h;
        hr.d().e(context);
        eoVar.C = new Configuration(context.getResources().getConfiguration());
        eoVar.O(false);
    }

    @Override // defpackage.bp, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        i().g();
    }

    @Override // defpackage.bp, defpackage.nh, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent intentV;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        dm dmVarH = h();
        if (menuItem.getItemId() != 16908332 || dmVarH == null || (dmVarH.a() & 4) == 0 || (intentV = clc.v(this)) == null) {
            return false;
        }
        if (!shouldUpRecreateTask(intentV)) {
            navigateUpTo(intentV);
            return true;
        }
        clt cltVar = new clt(this);
        Intent intentV2 = clc.v(this);
        if (intentV2 == null) {
            intentV2 = clc.v(this);
        }
        if (intentV2 != null) {
            ComponentName component = intentV2.getComponent();
            if (component == null) {
                component = intentV2.resolveActivity(cltVar.b.getPackageManager());
            }
            ArrayList arrayList = cltVar.a;
            int size = arrayList.size();
            try {
                Context context = cltVar.b;
                for (Intent intentW = clc.w(context, component); intentW != null; intentW = clc.w(context, intentW.getComponent())) {
                    arrayList.add(size, intentW);
                }
                arrayList.add(intentV2);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e);
            }
        }
        ArrayList arrayList2 = cltVar.a;
        if (arrayList2.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList2.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        cltVar.b.startActivities(intentArr, null);
        try {
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onPostCreate(bundle);
        ((eo) i()).B();
    }

    @Override // defpackage.bp, android.app.Activity
    protected void onPostResume() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onPostResume();
        dm dmVarB = ((eo) i()).b();
        if (dmVarB != null) {
            dmVarB.h(true);
        }
    }

    @Override // defpackage.bp, android.app.Activity
    protected void onStart() throws PackageManager.NameNotFoundException {
        super.onStart();
        ((eo) i()).O(true);
    }

    @Override // defpackage.bp, android.app.Activity
    protected void onStop() {
        super.onStop();
        i().h();
    }

    @Override // android.app.Activity
    protected final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        i().m(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        dm dmVarH = h();
        if (getWindow().hasFeature(0)) {
            if (dmVarH == null || !dmVarH.p()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // defpackage.nh, android.app.Activity
    public final void setContentView(int i) {
        es();
        i().j(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((eo) i()).D = i;
    }

    @Override // defpackage.nh, android.app.Activity
    public final void setContentView(View view) {
        es();
        i().k(view);
    }

    @Override // defpackage.nh, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        es();
        i().l(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}

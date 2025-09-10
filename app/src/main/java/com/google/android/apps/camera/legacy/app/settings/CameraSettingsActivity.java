package com.google.android.apps.camera.legacy.app.settings;

import android.app.Activity;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceGroup;
import android.preference.TwoStatePreference;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import com.google.android.apps.camera.legacy.app.app.CameraApp;
import com.google.android.apps.camera.ui.preference.ManagedSwitchPreference;
import com.google.ar.core.R;
import defpackage.dm;
import defpackage.eo;
import defpackage.eu;
import defpackage.ez;
import defpackage.fqg;
import defpackage.gox;
import defpackage.ixt;
import defpackage.izm;
import defpackage.jcz;
import defpackage.jda;
import defpackage.jde;
import defpackage.jdf;
import defpackage.jdh;
import defpackage.jgo;
import defpackage.lud;
import defpackage.luf;
import defpackage.luj;
import defpackage.mdy;
import defpackage.owd;
import defpackage.pbn;
import defpackage.pnq;
import defpackage.rka;
import defpackage.sgv;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CameraSettingsActivity extends ixt {
    public static final sgv s = sgv.g("com.google.android.apps.camera.legacy.app.settings.CameraSettingsActivity");
    private final Object t = new Object();
    private jde u;
    private boolean v;

    public static void t(PreferenceFragment preferenceFragment, jdf jdfVar, jdh jdhVar) {
        ManagedSwitchPreference managedSwitchPreference;
        if (!jdfVar.h.h() || (managedSwitchPreference = (ManagedSwitchPreference) preferenceFragment.findPreference(luf.aY.a)) == null) {
            return;
        }
        managedSwitchPreference.setEnabled(!((owd) r2.c()).a);
        lud ludVarA = lud.a(managedSwitchPreference.getKey());
        if (ludVarA != null) {
            managedSwitchPreference.setChecked(((Boolean) ((luj) jdhVar.i).b(ludVarA)).booleanValue());
        }
    }

    public static void u(mdy mdyVar, Preference preference) {
        Object value;
        if (preference.getKey().equals("pref_category_developer")) {
            return;
        }
        if (preference instanceof PreferenceGroup) {
            PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
            for (int i = 0; i < preferenceGroup.getPreferenceCount(); i++) {
                u(mdyVar, preferenceGroup.getPreference(i));
            }
            return;
        }
        if (preference.getOnPreferenceChangeListener() == null) {
            if (preference instanceof TwoStatePreference) {
                value = Boolean.valueOf(((TwoStatePreference) preference).isChecked());
            } else if (!(preference instanceof ListPreference)) {
                return;
            } else {
                value = ((ListPreference) preference).getValue();
            }
            preference.setOnPreferenceChangeListener(new jcz(mdyVar, value, 0));
        }
    }

    @Override // defpackage.ixt, defpackage.jhl, defpackage.bp, defpackage.nh, defpackage.dj, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!this.v) {
            synchronized (this.t) {
                if (!this.v) {
                    izm izmVarG = ((CameraApp) getApplicationContext()).g();
                    ((ixt) this).o = (pbn) izmVarG.k.a();
                    ((ixt) this).r = (fqg) izmVarG.gT.a();
                    ((ixt) this).p = jgo.c(izmVarG.zf);
                    ((ixt) this).q = (pnq) izmVarG.b.a();
                    this.v = true;
                }
            }
        }
        super.onCreate(bundle);
        rka.a(this);
        setContentView(R.layout.settings_activity_layout);
        getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        String stringExtra = getIntent().getStringExtra("pref_screen_title");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        eo eoVar = (eo) i();
        if (eoVar.g instanceof Activity) {
            dm dmVarB = eoVar.b();
            if (dmVarB instanceof ez) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            eoVar.l = null;
            if (dmVarB != null) {
                dmVarB.e();
            }
            eoVar.k = null;
            if (toolbar != null) {
                eu euVar = new eu(toolbar, eoVar.v(), eoVar.j);
                eoVar.k = euVar;
                eoVar.j.d = euVar.d;
                if (!toolbar.B) {
                    toolbar.B = true;
                    toolbar.t();
                }
            } else {
                eoVar.j.d = null;
            }
            eoVar.f();
        }
        dm dmVarH = h();
        dmVarH.getClass();
        dmVarH.g(true);
        dmVarH.s();
        if (stringExtra == null) {
            setTitle(R.string.pref_camera_settings_category);
            dmVarH.u();
        } else {
            setTitle(stringExtra);
            dmVarH.i(stringExtra);
        }
        String stringExtra2 = getIntent().getStringExtra("pref_screen_extra");
        String stringExtra3 = getIntent().getStringExtra("pref_open_setting_page");
        String stringExtra4 = getIntent().getStringExtra("list_pref_extra");
        boolean booleanExtra = getIntent().getBooleanExtra("pref_make_setting_page_root", false);
        this.u = new jde();
        Bundle bundle2 = new Bundle(1);
        bundle2.putString("pref_screen_extra", stringExtra2);
        bundle2.putString("list_pref_extra", stringExtra4);
        bundle2.putString("pref_open_setting_page", stringExtra3);
        bundle2.putBoolean("pref_make_setting_page_root", booleanExtra);
        this.u.setArguments(bundle2);
        getFragmentManager().beginTransaction().replace(R.id.settings_activity_content, this.u).commit();
        j().b(new jda(this));
    }

    @Override // defpackage.jhl, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            if ((getIntent().getFlags() & 33554432) != 0) {
                setResult(-1);
            }
            finish();
        }
        return true;
    }

    @Override // defpackage.jhl, defpackage.bp, defpackage.nh, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 1) {
            for (int i2 : iArr) {
                if (i2 == 0) {
                    return;
                }
            }
            jde jdeVar = this.u;
            int i3 = jde.c;
            jdeVar.a();
        }
    }

    @Override // defpackage.ixt
    public final gox s() {
        return super.s();
    }
}

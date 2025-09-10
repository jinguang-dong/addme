package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.Handler;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreference;
import com.google.android.apps.camera.legacy.app.settings.CameraGm3SettingsActivity;
import com.google.android.apps.camera.ui.preference.BlockableListPreferenceCompat;
import com.google.android.apps.camera.ui.preference.ManagedSwitchPreferenceCompat;
import com.google.android.apps.camera.ui.zoomlock.Gx.nWEkBGOQPWQp;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jdl extends eoo {
    private static final sgv aj = sgv.g("jdl");
    public ManagedSwitchPreferenceCompat ah;
    public obu ai;
    private ManagedSwitchPreferenceCompat ak;

    private final jdh H() {
        bp activity = getActivity();
        activity.getClass();
        jdh jdhVar = ((CameraGm3SettingsActivity) activity).o;
        jdhVar.getClass();
        return jdhVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    private final void I(boolean z) {
        String str = (z ? luf.p : luf.q).a;
        if (H().f.contains(str)) {
            return;
        }
        jdh.d();
        String str2 = true != z ? "pref_category_hotshot_non_talkback_key" : "pref_category_hotshot_key";
        PreferenceGroup preferenceGroup = (PreferenceGroup) a("pref_category_general");
        if (preferenceGroup != null) {
            int iK = preferenceGroup.k();
            int i = 0;
            while (true) {
                if (i >= iK) {
                    break;
                }
                Preference preferenceO = preferenceGroup.o(i);
                preferenceO.getClass();
                if (a.ao(preferenceO.r, str2)) {
                    preferenceGroup.ad(preferenceO);
                    break;
                }
                i++;
            }
        }
    }

    private final void J() {
        PreferenceCategory preferenceCategory = (PreferenceCategory) a("pref_category_resolution_camera");
        Preference preferenceL = preferenceCategory != null ? preferenceCategory.l("pref_camera_resolution") : null;
        if (preferenceL != null) {
            preferenceCategory.ad(preferenceL);
            preferenceCategory.ae(preferenceL);
        }
        Preference preferenceL2 = preferenceCategory != null ? preferenceCategory.l(luf.s.a) : null;
        if (preferenceL2 != null) {
            preferenceCategory.ad(preferenceL2);
            preferenceCategory.ae(preferenceL2);
        }
    }

    private final void K(String str) {
        Preference preferenceA = a(str);
        PreferenceGroup preferenceGroup = preferenceA != null ? preferenceA.C : null;
        if (preferenceGroup == null || preferenceGroup.ad(preferenceA)) {
            return;
        }
        ((sgt) aj.c().M(2687)).v("Failed to remove preference :%s", str);
    }

    public final jdf F() {
        bp activity = getActivity();
        activity.getClass();
        jdf jdfVar = ((CameraGm3SettingsActivity) activity).p;
        jdfVar.getClass();
        return jdfVar;
    }

    public final void G(String str, Object obj, Object obj2) {
        F().n.i(str, obj, obj2);
    }

    @Override // defpackage.dav, defpackage.bm
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.ai = new obu((Activity) requireActivity(), (dav) this);
    }

    @Override // defpackage.bm
    public final void onResume() {
        super.onResume();
        requireActivity().setTitle(requireActivity().getString(R.string.pref_camera_settings_category));
        ListPreference listPreference = (ListPreference) a(luf.d.a);
        int i = 1;
        if (listPreference != null) {
            listPreference.n(listPreference.g[listPreference.k(listPreference.i)]);
            listPreference.n = new jdj(this, i);
        }
        J();
        obu obuVar = this.ai;
        if (obuVar == null) {
            ujp.c("locationHandler");
            obuVar = null;
        }
        if (!obuVar.p()) {
            F().a();
            ManagedSwitchPreferenceCompat managedSwitchPreferenceCompat = this.ah;
            if (managedSwitchPreferenceCompat != null) {
                managedSwitchPreferenceCompat.k(false);
            }
        }
        ManagedSwitchPreferenceCompat managedSwitchPreferenceCompat2 = this.ak;
        if (managedSwitchPreferenceCompat2 != null) {
            managedSwitchPreferenceCompat2.H(true);
        }
        J();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v36, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v39, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v44, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v75, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.dav
    public final void D() throws Resources.NotFoundException {
        ListPreference listPreference;
        PreferenceScreen preferenceScreen;
        ManagedSwitchPreferenceCompat managedSwitchPreferenceCompat;
        ManagedSwitchPreferenceCompat managedSwitchPreferenceCompat2;
        BlockableListPreferenceCompat blockableListPreferenceCompat;
        dbe dbeVar;
        PreferenceScreen preferenceScreen2;
        dbe dbeVar2 = ((dav) this).a;
        if (dbeVar2 == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
        Context contextRequireContext = requireContext();
        PreferenceScreen preferenceScreenD = d();
        final int i = 1;
        dbeVar2.f(true);
        int i2 = dba.a;
        int i3 = 2;
        Object[] objArr = new Object[2];
        String[] strArr = {String.valueOf(Preference.class.getPackage().getName()).concat("."), String.valueOf(SwitchPreference.class.getPackage().getName()).concat(".")};
        XmlResourceParser xml = contextRequireContext.getResources().getXml(R.xml.camera_gm3_preferences);
        try {
            Preference preferenceA = dba.a(xml, preferenceScreenD, contextRequireContext, objArr, dbeVar2, strArr);
            xml.close();
            PreferenceScreen preferenceScreen3 = (PreferenceScreen) preferenceA;
            preferenceScreen3.D(dbeVar2);
            final int i4 = 0;
            dbeVar2.f(false);
            if (preferenceScreen3 != null && preferenceScreen3 != (preferenceScreen2 = (dbeVar = ((dav) this).a).b)) {
                if (preferenceScreen2 != null) {
                    preferenceScreen2.E();
                }
                dbeVar.b = preferenceScreen3;
                this.c = true;
                if (this.d) {
                    Handler handler = this.ag;
                    if (!handler.hasMessages(1)) {
                        handler.obtainMessage(1).sendToTarget();
                    }
                }
            }
            ManagedSwitchPreferenceCompat managedSwitchPreferenceCompat3 = (ManagedSwitchPreferenceCompat) a(luf.b.a);
            this.ah = managedSwitchPreferenceCompat3;
            if (managedSwitchPreferenceCompat3 != null) {
                managedSwitchPreferenceCompat3.d = new jdj(this, 3);
            }
            ?? r2 = H().f;
            String str = luf.R.a;
            if (r2.contains(str)) {
                K(str);
            } else {
                K(luf.Q.a);
                ListPreference listPreference2 = (ListPreference) a(str);
                if (listPreference2 != null) {
                    if (listPreference2.i == null) {
                        if (H().c()) {
                            listPreference2.e(0);
                            listPreference2.I(R.drawable.ic_hevc_gm2_24px);
                        } else {
                            listPreference2.e(1);
                            listPreference2.I(R.drawable.gs_avc_vd_theme_24);
                        }
                    }
                    listPreference2.n = new jdi(this, listPreference2, i4);
                }
            }
            ?? r22 = H().f;
            CharSequence charSequence = luf.k.a;
            if (r22.contains(charSequence)) {
                ManagedSwitchPreferenceCompat managedSwitchPreferenceCompat4 = (ManagedSwitchPreferenceCompat) a(charSequence);
                if (managedSwitchPreferenceCompat4 != null) {
                    String string = getString(R.string.pref_camera_sounds_disabled_summary);
                    string.getClass();
                    managedSwitchPreferenceCompat4.n(string);
                    managedSwitchPreferenceCompat4.H(false);
                    managedSwitchPreferenceCompat4.aa();
                    managedSwitchPreferenceCompat4.c = new idv(17);
                }
                H().f.remove(charSequence);
            }
            ManagedSwitchPreferenceCompat managedSwitchPreferenceCompat5 = (ManagedSwitchPreferenceCompat) a("pref_camera_enable_iris");
            String string2 = getString(R.string.pref_camera_lens_subtitle_legacy);
            string2.getClass();
            if (managedSwitchPreferenceCompat5 != null) {
                managedSwitchPreferenceCompat5.n(string2);
            }
            ?? r23 = H().f;
            CharSequence charSequence2 = luf.l.a;
            if (!r23.contains(charSequence2) && (blockableListPreferenceCompat = (BlockableListPreferenceCompat) a(charSequence2)) != null) {
                int iK = blockableListPreferenceCompat.k(String.valueOf(H().a()));
                blockableListPreferenceCompat.e(iK);
                blockableListPreferenceCompat.n(((ListPreference) blockableListPreferenceCompat).g[iK]);
                blockableListPreferenceCompat.n = new jdj(this, i4);
            }
            ?? r24 = H().f;
            CharSequence charSequence3 = luf.n.a;
            if (!r24.contains(charSequence3)) {
            }
            I(true);
            I(false);
            if (!H().f.contains("pref_audio_zoom_key") && (managedSwitchPreferenceCompat2 = (ManagedSwitchPreferenceCompat) a("pref_audio_zoom_key")) != null) {
                managedSwitchPreferenceCompat2.d = new jdi(this, managedSwitchPreferenceCompat2, i3);
            }
            ?? r25 = H().f;
            CharSequence charSequence4 = luf.S.a;
            if (!r25.contains(charSequence4) && (managedSwitchPreferenceCompat = (ManagedSwitchPreferenceCompat) a(charSequence4)) != null) {
                managedSwitchPreferenceCompat.n(getResources().getString(R.string.pref_video_optimize_fps_summary, 60, 30));
            }
            if (!H().f.contains("pref_category_boba_jelly") && ((PreferenceScreen) a("pref_category_boba_jelly")) != null && F().c.isPresent()) {
                ((nuj) F().c.get()).a();
            }
            for (String str2 : H().f) {
                str2.getClass();
                K(str2);
            }
            ?? r26 = H().f;
            CharSequence charSequence5 = luf.aZ.a;
            if (r26.contains(charSequence5)) {
                PreferenceCategory preferenceCategory = (PreferenceCategory) a(nWEkBGOQPWQp.vAELIFkcXUjR);
                if (preferenceCategory != null && (preferenceScreen = (PreferenceScreen) a("prefscreen_top")) != null) {
                    preferenceScreen.ad(preferenceCategory);
                }
            } else {
                ManagedSwitchPreferenceCompat managedSwitchPreferenceCompat6 = (ManagedSwitchPreferenceCompat) a(charSequence5);
                if (managedSwitchPreferenceCompat6 != null) {
                    managedSwitchPreferenceCompat6.d = new jdi(this, managedSwitchPreferenceCompat6, i);
                }
            }
            ?? r27 = H().f;
            CharSequence charSequence6 = luf.O.a;
            if (!r27.contains(charSequence6)) {
                this.ak = (ManagedSwitchPreferenceCompat) a(charSequence6);
            }
            Preference preferenceA2 = a("pref_launch_help");
            if (preferenceA2 != null) {
                preferenceA2.o = new dam(this) { // from class: jdk
                    public final /* synthetic */ jdl a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.dam
                    public final void a(Preference preference) throws PackageManager.NameNotFoundException {
                        if (i == 0) {
                            int i5 = fed.a;
                            bp activity = this.a.getActivity();
                            fed.a(activity.getPackageName(), activity.getApplicationContext());
                            return;
                        }
                        int i6 = fed.a;
                        bp activity2 = this.a.getActivity();
                        Context applicationContext = activity2.getApplicationContext();
                        activity2.getPackageName();
                        fed.c(applicationContext, activity2);
                    }
                };
            }
            Preference preferenceA3 = a("pref_launch_feedback");
            if (preferenceA3 != null) {
                preferenceA3.o = new dam(this) { // from class: jdk
                    public final /* synthetic */ jdl a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.dam
                    public final void a(Preference preference) throws PackageManager.NameNotFoundException {
                        if (i4 == 0) {
                            int i5 = fed.a;
                            bp activity = this.a.getActivity();
                            fed.a(activity.getPackageName(), activity.getApplicationContext());
                            return;
                        }
                        int i6 = fed.a;
                        bp activity2 = this.a.getActivity();
                        Context applicationContext = activity2.getApplicationContext();
                        activity2.getPackageName();
                        fed.c(applicationContext, activity2);
                    }
                };
            }
            ?? r0 = H().f;
            CharSequence charSequence7 = luf.ba.a;
            if (r0.contains(charSequence7) || (listPreference = (ListPreference) a(charSequence7)) == null) {
                return;
            }
            if (a.ao(listPreference.i, "0")) {
                listPreference.o("1");
            }
            listPreference.n(listPreference.g[listPreference.k(listPreference.i)]);
            listPreference.n = new jdj(listPreference, i3);
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }
}

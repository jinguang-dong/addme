package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceFragment;
import android.preference.PreferenceGroup;
import android.preference.PreferenceScreen;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.apps.camera.jni.saliency.tLp.KsvNaXS;
import com.google.android.apps.camera.legacy.app.settings.CameraSettingsActivity;
import com.google.android.apps.camera.ui.preference.BlockableListPreference;
import com.google.android.apps.camera.ui.preference.EmptyListPreference;
import com.google.android.apps.camera.ui.preference.KeyListenerPreference;
import com.google.android.apps.camera.ui.preference.ManagedSwitchPreference;
import com.google.android.apps.camera.ui.preference.StorageStatusPreference;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jde extends PreferenceFragment implements SharedPreferences.OnSharedPreferenceChangeListener {
    public static final /* synthetic */ int c = 0;
    public jdf a;
    public ManagedSwitchPreference b;
    private jdh d;
    private String e;
    private String f;
    private ManagedSwitchPreference g;
    private final HashMap h = new HashMap();

    private final PreferenceScreen c(PreferenceGroup preferenceGroup, String str) {
        PreferenceScreen preferenceScreenC;
        if ((preferenceGroup instanceof PreferenceScreen) && str.equals(preferenceGroup.getKey())) {
            return (PreferenceScreen) preferenceGroup;
        }
        for (int i = 0; i < preferenceGroup.getPreferenceCount(); i++) {
            Preference preference = preferenceGroup.getPreference(i);
            if ((preference instanceof PreferenceGroup) && (preferenceScreenC = c((PreferenceGroup) preference, str)) != null) {
                return preferenceScreenC;
            }
        }
        return null;
    }

    private final void d(PreferenceGroup preferenceGroup) {
        for (int i = 0; i < preferenceGroup.getPreferenceCount(); i++) {
            Preference preference = preferenceGroup.getPreference(i);
            if (preference instanceof PreferenceGroup) {
                d((PreferenceGroup) preference);
            }
        }
    }

    private final void e(String str) {
        PreferenceGroup parent;
        Preference preferenceFindPreference = findPreference(str);
        if (preferenceFindPreference == null || (parent = preferenceFindPreference.getParent()) == null || parent.removePreference(preferenceFindPreference)) {
            return;
        }
        ((sgt) CameraSettingsActivity.s.c().M(2682)).v("Failed to remove preference :%s", str);
    }

    private final void f(PreferenceScreen preferenceScreen) {
        Intent intent = new Intent(getActivity(), (Class<?>) CameraSettingsActivity.class);
        intent.putExtra("pref_screen_extra", preferenceScreen.getKey());
        intent.putExtra("pref_screen_title", preferenceScreen.getTitle());
        preferenceScreen.setIntent(intent);
    }

    private final void g(String str) {
        Preference preferenceFindPreference = findPreference(str);
        if (preferenceFindPreference instanceof PreferenceScreen) {
            f((PreferenceScreen) preferenceFindPreference);
        }
    }

    private final void h(String str) {
        PreferenceGroup preferenceGroup = (PreferenceGroup) findPreference("pref_category_general");
        if (preferenceGroup != null) {
            for (int i = 0; i < preferenceGroup.getPreferenceCount(); i++) {
                Preference preference = preferenceGroup.getPreference(i);
                if (preference.getKey().equals(str)) {
                    preferenceGroup.removePreference(preference);
                    return;
                }
            }
        }
    }

    public final void a() {
        this.a.a();
        this.b.setChecked(false);
    }

    public final boolean b() {
        return getActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 || getActivity().checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    @Override // android.preference.PreferenceFragment
    public final PreferenceScreen getPreferenceScreen() {
        PreferenceScreen preferenceScreen = super.getPreferenceScreen();
        String str = this.e;
        if (str == null || preferenceScreen == null) {
            return preferenceScreen;
        }
        PreferenceScreen preferenceScreenC = c(preferenceScreen, str);
        if (preferenceScreenC != null) {
            return preferenceScreenC;
        }
        throw new RuntimeException("key " + this.e + " not found");
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.List] */
    @Override // android.preference.PreferenceFragment, android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        PreferenceScreen preferenceScreen;
        d((PreferenceCategory) findPreference("pref_category_resolution_camera"));
        d((PreferenceCategory) findPreference("pref_category_resolution_video"));
        if (!this.d.f.contains("pref_category_custom_hotkeys") && (preferenceScreen = (PreferenceScreen) findPreference("pref_category_custom_hotkeys")) != null) {
            for (int i = 0; i < preferenceScreen.getPreferenceCount(); i++) {
                Preference preference = preferenceScreen.getPreference(i);
                String string = preference.getSharedPreferences().getString(preference.getKey(), "-1");
                HashMap map = this.h;
                if (!map.containsKey(preference.getKey())) {
                    map.put(preference.getKey(), string);
                }
            }
        }
        View view = getView();
        view.getClass();
        ((ListView) view.findViewById(R.id.list)).setDivider(null);
        super.onActivityCreated(bundle);
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, sea] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v27, types: [java.lang.Object, owq] */
    @Override // android.preference.PreferenceFragment, android.app.Fragment
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        int i;
        String string;
        ManagedSwitchPreference managedSwitchPreference;
        ManagedSwitchPreference managedSwitchPreference2;
        BlockableListPreference blockableListPreference;
        izm izmVarG = ((jak) getActivity().getApplication()).g();
        super.onCreate(bundle);
        gox goxVarS = ((CameraSettingsActivity) getActivity()).s();
        ejt ejtVar = new ejt(getActivity(), (byte[]) null);
        goxVarS.getClass();
        izp izpVar = new izp(izmVarG.a, goxVarS, ejtVar);
        izm izmVar = izpVar.a;
        pkc pkcVar = (pkc) izmVar.im.a();
        hbj hbjVar = (hbj) izmVar.o.a();
        pfl pflVar = (pfl) izmVar.we.a();
        luj lujVar = (luj) izmVar.eZ.a();
        luj lujVar2 = (luj) izmVar.eZ.a();
        AccessibilityManager accessibilityManagerI = izmVar.i();
        owq owqVar = (owq) izmVar.uI.a();
        sfd sfdVar = sfd.a;
        this.d = new jdh(pkcVar, hbjVar, pflVar, lujVar, lujVar2, accessibilityManagerI, owqVar, sfdVar, sfdVar, sfdVar);
        ejt ejtVar2 = izpVar.w;
        Context contextD = jdg.d(ejtVar2);
        hfi hfiVar = new hfi(contextD);
        Context contextD2 = jdg.d(ejtVar2);
        ((hbj) izmVar.o.a()).getClass();
        dbe.c(new on(contextD2, com.google.ar.core.R.style.Theme_CameraSettings)).getClass();
        new ArrayList();
        mdy mdyVar = (mdy) izmVar.O.a();
        owq owqVar2 = (owq) izmVar.lF.a();
        owq owqVar3 = (owq) izmVar.ke.a();
        mdy mdyVar2 = (mdy) izmVar.O.a();
        Context context = (Context) izmVar.yV.b;
        hbp hbpVar = new hbp(context, owqVar3, mdyVar2);
        mgf mgfVar = new mgf(izpVar.a(), (mgp) izmVar.oT.a(), izpVar.b(), (ScheduledExecutorService) izmVar.p.a(), (out) izmVar.z.a(), (mdy) izmVar.O.a(), (hbj) izmVar.o.a());
        izpVar.a();
        izpVar.b();
        obu obuVar = new obu(context, izmVar.eZ.a());
        tzj tzjVarB = tzs.b(izpVar.d);
        luk lukVar = (luk) izmVar.eY.a();
        rwc rwcVarK = izmVar.k();
        rwc rwcVarL = izmVar.l();
        rwc rwcVarM = izmVar.m();
        rwc rwcVar = (rwc) izpVar.o.a();
        rwc rwcVar2 = (rwc) izpVar.r.a();
        rwc rwcVar3 = (rwc) izpVar.u.a();
        rwc rwcVarJ = izmVar.j();
        Optional optional = (Optional) izmVar.yU.a();
        this.a = new jdf(hfiVar, mdyVar, owqVar2, hbpVar, mgfVar, obuVar, tzjVarB, lukVar, rwcVarK, rwcVarL, rwcVarM, rwcVar, rwcVar2, rwcVar3, rwcVarJ, optional);
        this.d.b(getContext());
        ?? r1 = this.d.f;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.e = arguments.getString("pref_screen_extra");
            this.f = arguments.getString("list_pref_extra");
        }
        addPreferencesFromResource(com.google.ar.core.R.xml.camera_preferences);
        PreferenceScreen preferenceScreen = (PreferenceScreen) findPreference("prefscreen_top");
        sgj sgjVarListIterator = ((sfd) this.d.c).listIterator();
        while (true) {
            i = 1;
            if (!sgjVarListIterator.hasNext()) {
                break;
            }
            lvf lvfVar = (lvf) sgjVarListIterator.next();
            PreferenceCategory preferenceCategory = new PreferenceCategory(preferenceScreen.getContext());
            preferenceCategory.setTitle(lvfVar.b());
            preferenceCategory.setKey(lvfVar.c());
            preferenceCategory.setOrder(lvfVar.a());
            preferenceCategory.setLayoutResource(com.google.ar.core.R.layout.preference_category_layout);
            preferenceCategory.setOrderingAsAdded(true);
            preferenceScreen.addPreference(preferenceCategory);
            if (lvfVar.a() < 0) {
                findPreference("pref_category_general").setLayoutResource(com.google.ar.core.R.layout.preference_category_layout);
            }
            for (lvg lvgVar : lvfVar.d()) {
                Preference preference = new Preference(preferenceCategory.getContext());
                preference.setTitle(lvgVar.b());
                preference.setKey(lvgVar.d());
                preference.setSummary(lvgVar.e());
                preference.setIcon(lvgVar.a());
                Intent intentC = lvgVar.c();
                if (intentC != null) {
                    preference.setIntent(intentC);
                }
                preference.setLayoutResource(com.google.ar.core.R.layout.preference_with_margin);
                preferenceCategory.addPreference(preference);
            }
        }
        if (!r1.contains("pref_audio_zoom_key")) {
            ManagedSwitchPreference managedSwitchPreference3 = (ManagedSwitchPreference) findPreference("pref_audio_zoom_key");
            managedSwitchPreference3.b = new jcz(this, managedSwitchPreference3, 4);
        }
        String str = luf.R.a;
        int i2 = 2;
        int i3 = 0;
        if (r1.contains(str)) {
            e(str);
        } else {
            e(luf.Q.a);
            ListPreference listPreference = (ListPreference) findPreference(str);
            if (listPreference.getValue() != null) {
                String value = listPreference.getValue();
                if (value.equals(getString(com.google.ar.core.R.string.pref_codec_format_hevc_entry_value))) {
                    listPreference.setIcon(com.google.ar.core.R.drawable.ic_hevc_gm2_24px);
                } else if (value.equals(getString(com.google.ar.core.R.string.pref_codec_format_avc_entry_value))) {
                    listPreference.setIcon(com.google.ar.core.R.drawable.gs_avc_vd_theme_24);
                } else {
                    listPreference.setIcon(com.google.ar.core.R.drawable.gs_pets_vd_theme_24);
                }
            } else if (this.d.c()) {
                listPreference.setValueIndex(0);
                listPreference.setIcon(com.google.ar.core.R.drawable.ic_hevc_gm2_24px);
            } else {
                listPreference.setValueIndex(1);
                listPreference.setIcon(com.google.ar.core.R.drawable.gs_avc_vd_theme_24);
            }
            listPreference.setOnPreferenceChangeListener(new jcz(this, listPreference, i2));
        }
        String str2 = luf.S.a;
        if (!r1.contains(str2)) {
            ((ManagedSwitchPreference) findPreference(str2)).setSummary(getString(com.google.ar.core.R.string.pref_video_optimize_fps_summary, new Object[]{60, 30}));
        }
        String str3 = luf.k.a;
        int i4 = 15;
        if (r1.contains(str3)) {
            ManagedSwitchPreference managedSwitchPreference4 = (ManagedSwitchPreference) findPreference(str3);
            managedSwitchPreference4.setSummary(getString(com.google.ar.core.R.string.pref_camera_sounds_disabled_summary));
            managedSwitchPreference4.setEnabled(false);
            managedSwitchPreference4.setSelectable(false);
            managedSwitchPreference4.g = new idv(15);
            r1.remove(str3);
        }
        if (!r1.contains("pref_camera_enable_iris")) {
            ((ManagedSwitchPreference) findPreference("pref_camera_enable_iris")).setSummary(getString(com.google.ar.core.R.string.pref_camera_lens_subtitle_legacy));
        }
        String str4 = luf.l.a;
        if (!r1.contains(str4) && (blockableListPreference = (BlockableListPreference) findPreference(str4)) != null) {
            blockableListPreference.a = new ipr(this, 17);
            int iFindIndexOfValue = blockableListPreference.findIndexOfValue(String.valueOf(this.d.a()));
            String str5 = this.f;
            if (str5 != null && str5.equals(str4)) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle(blockableListPreference.getDialogTitle());
                builder.setIcon(blockableListPreference.getDialogIcon());
                blockableListPreference.setValueIndex(iFindIndexOfValue);
                builder.setSingleChoiceItems(blockableListPreference.getEntries(), iFindIndexOfValue, new jdc(0));
                builder.setPositiveButton(com.google.ar.core.R.string.dialog_cancel, new jdc(2));
                builder.setItems(blockableListPreference.getEntries(), new fdf(blockableListPreference, 7, null));
                builder.create().show();
            }
            blockableListPreference.setValueIndex(iFindIndexOfValue);
            blockableListPreference.setSummary(blockableListPreference.getEntries()[iFindIndexOfValue]);
            blockableListPreference.setOnPreferenceChangeListener(new jdb(this, i2));
        }
        String str6 = luf.n.a;
        if (!r1.contains(str6)) {
            ((ManagedSwitchPreference) findPreference(str6)).h = new ipr(this, 18);
        }
        ManagedSwitchPreference managedSwitchPreference5 = (ManagedSwitchPreference) findPreference(luf.b.a);
        this.b = managedSwitchPreference5;
        int i5 = 3;
        managedSwitchPreference5.b = new jdb(this, i5);
        Iterator it = r1.iterator();
        while (it.hasNext()) {
            e((String) it.next());
        }
        String str7 = luf.aZ.a;
        if (r1.contains(str7)) {
            preferenceScreen.removePreference((PreferenceCategory) findPreference("pref_category_manual_controls"));
        } else {
            ManagedSwitchPreference managedSwitchPreference6 = (ManagedSwitchPreference) findPreference(str7);
            managedSwitchPreference6.b = new jcz(this, managedSwitchPreference6, i5);
        }
        if (!r1.contains("pref_category_developer")) {
            this.a.a.a((PreferenceScreen) findPreference("pref_category_developer"));
        }
        if (!r1.contains("pref_category_frequent_faces")) {
            PreferenceScreen preferenceScreen2 = (PreferenceScreen) findPreference("pref_category_frequent_faces");
            hbp hbpVar2 = this.a.o;
            Activity activity = getActivity();
            ManagedSwitchPreference managedSwitchPreference7 = (ManagedSwitchPreference) preferenceScreen2.findPreference("key_ff_opt_in");
            if (managedSwitchPreference7 != null) {
                managedSwitchPreference7.setChecked(((Boolean) hbpVar2.a.dL()).booleanValue());
                managedSwitchPreference7.b = new jdb(hbpVar2, i);
                String string2 = ((Context) hbpVar2.c).getResources().getString(com.google.ar.core.R.string.frequent_faces_learn_more);
                hbv hbvVar = new hbv(activity, 14);
                managedSwitchPreference7.d = string2;
                managedSwitchPreference7.c = hbvVar;
            }
        }
        if (!r1.contains("pref_category_storage")) {
            PreferenceScreen preferenceScreen3 = (PreferenceScreen) findPreference("pref_category_storage");
            preferenceScreen3.setOnPreferenceClickListener(new hfh(this, i2));
            final mgf mgfVar2 = this.a.b;
            Activity activity2 = getActivity();
            mgfVar2.d = (StorageStatusPreference) preferenceScreen3.findPreference("pref_storage_status");
            mgfVar2.d.setLayoutResource(com.google.ar.core.R.layout.preference_storage_status);
            final ManagedSwitchPreference managedSwitchPreference8 = (ManagedSwitchPreference) preferenceScreen3.findPreference(luf.an.a);
            final ManagedSwitchPreference managedSwitchPreference9 = (ManagedSwitchPreference) preferenceScreen3.findPreference(luf.ao.a);
            managedSwitchPreference9.setSummary(activity2.getResources().getString(com.google.ar.core.R.string.pref_low_storage_mode_auto_disable_summary, 1));
            managedSwitchPreference9.setEnabled(managedSwitchPreference8.isChecked());
            managedSwitchPreference8.b = new Preference.OnPreferenceChangeListener() { // from class: mge
                /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, owq] */
                /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, owq] */
                /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, owq] */
                /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, owq] */
                /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, owq] */
                @Override // android.preference.Preference.OnPreferenceChangeListener
                public final boolean onPreferenceChange(Preference preference2, Object obj) {
                    boolean zEquals = obj.equals(Boolean.TRUE);
                    ManagedSwitchPreference managedSwitchPreference10 = managedSwitchPreference9;
                    mgf mgfVar3 = mgfVar2;
                    if (zEquals) {
                        mgi mgiVar = mgfVar3.a;
                        Object obj2 = mgiVar.f;
                        lur lurVar = luf.an;
                        luj lujVar3 = (luj) obj2;
                        if (!((Boolean) lujVar3.b(lurVar)).booleanValue()) {
                            ((luj) mgiVar.g).d(lurVar, true);
                        }
                        Object obj3 = mgiVar.g;
                        ?? r10 = mgiVar.a;
                        luj lujVar4 = (luj) obj3;
                        lujVar4.d(luf.ap, (Boolean) r10.dL());
                        ?? r11 = mgiVar.b;
                        lujVar4.d(luf.aq, (String) r11.dL());
                        lus lusVar = luf.ar;
                        lus lusVar2 = luf.aO;
                        lujVar4.d(lusVar, (Integer) lujVar3.b(lusVar2));
                        lur lurVar2 = luf.as;
                        lur lurVar3 = luf.Q;
                        lujVar4.d(lurVar2, (Boolean) lujVar3.b(lurVar3));
                        ?? r8 = mgiVar.c;
                        lujVar4.d(luf.at, (Boolean) r8.dL());
                        owx owxVar = (owx) mgiVar.d;
                        lujVar4.d(luf.au, ((lty) owxVar.dL()).name());
                        ?? r5 = ((pmv) mgiVar.i).b;
                        lujVar4.d(luf.av, ((ltt) r5.dL()).name());
                        r10.a(false);
                        if (((hbj) mgiVar.h).o(gzo.bA)) {
                            r11.a("medium");
                        } else {
                            lujVar4.d(luf.aS, Integer.valueOf(lts.DEFAULT.c));
                        }
                        lujVar4.d(lusVar2, 0);
                        lujVar4.d(lurVar3, true);
                        r8.a(false);
                        owxVar.a(lty.RES_1080P);
                        r5.a(ltt.FPS_30);
                        mgiVar.e.a(false);
                        managedSwitchPreference10.setEnabled(true);
                    } else {
                        mgfVar3.a.a();
                        managedSwitchPreference10.setEnabled(false);
                    }
                    ManagedSwitchPreference managedSwitchPreference11 = managedSwitchPreference8;
                    mgfVar3.a();
                    mgfVar3.g.i(managedSwitchPreference11.getKey(), Boolean.valueOf(managedSwitchPreference11.isChecked()), obj);
                    return true;
                }
            };
            String string3 = activity2.getResources().getString(com.google.ar.core.R.string.settings_impacted_button);
            mgb mgbVar = new mgb(activity2, mgfVar2.h);
            managedSwitchPreference8.e = string3;
            managedSwitchPreference8.f = mgbVar;
            preferenceScreen3.findPreference("pref_free_up_space").setOnPreferenceClickListener(new hfh(activity2, 5));
            ske.W(mgfVar2.f.b(mgfVar2.b), new jcb(mgfVar2, 12), mgfVar2.c);
        }
        if (!r1.contains("pref_category_boba_jelly") && this.a.c.isPresent()) {
            nuj nujVar = (nuj) this.a.c.get();
            getActivity();
            nujVar.b();
        }
        String str8 = luf.p.a;
        if (!r1.contains(str8)) {
            jdh.d();
            h("pref_category_hotshot_key");
            ((ManagedSwitchPreference) findPreference(str8)).h = new ipr(this, 19);
        }
        String str9 = luf.q.a;
        if (!r1.contains(str9)) {
            jdh.d();
            h("pref_category_hotshot_non_talkback_key");
            ((ManagedSwitchPreference) findPreference(str9)).h = new ipr(this, i4);
        }
        String str10 = luf.r.a;
        if (!r1.contains(str10)) {
            ((ManagedSwitchPreference) findPreference(str10)).h = new ipr(this, 16);
        }
        PreferenceScreen preferenceScreen4 = (PreferenceScreen) findPreference("pref_category_advanced");
        if (preferenceScreen4.getPreferenceCount() <= 0) {
            e("pref_category_advanced");
        } else {
            ManagedSwitchPreference managedSwitchPreference10 = (ManagedSwitchPreference) preferenceScreen4.findPreference("pref_camera_raw_output_option_available_key");
            if (managedSwitchPreference10 != null) {
                managedSwitchPreference10.b = new jdb(this, i3);
            }
        }
        String str11 = luf.O.a;
        if (!r1.contains(str11)) {
            this.g = (ManagedSwitchPreference) findPreference(str11);
        }
        rwc rwcVar4 = this.a.e;
        if (!r1.contains("pref_camera_kepler_enabled_key") && rwcVar4.h()) {
            ManagedSwitchPreference managedSwitchPreference11 = (ManagedSwitchPreference) findPreference("pref_camera_kepler_enabled_key");
            managedSwitchPreference11.setTitle(com.google.ar.core.R.string.pref_kepler_title);
            managedSwitchPreference11.setSummary(com.google.ar.core.R.string.pref_kepler_summary);
        }
        rwc rwcVar5 = this.a.f;
        String str12 = luf.bd.a;
        if (!r1.contains(str12) && rwcVar5.h() && (managedSwitchPreference2 = (ManagedSwitchPreference) findPreference(str12)) != null) {
            rwcVar5.c();
            managedSwitchPreference2.setTitle(com.google.ar.core.R.string.pref_astro_animation_title);
            rwcVar5.c();
            managedSwitchPreference2.setSummary(com.google.ar.core.R.string.pref_astro_animation_summary);
        }
        rwc rwcVar6 = this.a.g;
        String str13 = luf.aT.a;
        if (!r1.contains(str13) && rwcVar6.h() && (managedSwitchPreference = (ManagedSwitchPreference) findPreference(str13)) != null) {
            managedSwitchPreference.setTitle(com.google.ar.core.R.string.pref_pistachio_title);
            managedSwitchPreference.setSummary(com.google.ar.core.R.string.pref_pistachio_summary);
        }
        rwc rwcVar7 = this.a.h;
        String str14 = luf.aY.a;
        if (r1.contains(str14) || !rwcVar7.h()) {
            e(str14);
        } else {
            ManagedSwitchPreference managedSwitchPreference12 = (ManagedSwitchPreference) findPreference(str14);
            if (managedSwitchPreference12 != null) {
                managedSwitchPreference12.setTitle(com.google.ar.core.R.string.pref_underwater_title);
                managedSwitchPreference12.setSummary(com.google.ar.core.R.string.pref_underwater_summary);
            }
        }
        String str15 = luf.ba.a;
        if (!r1.contains(str15)) {
            EmptyListPreference emptyListPreference = (EmptyListPreference) findPreference(str15);
            if (emptyListPreference.getValue().equals("0")) {
                emptyListPreference.setValue("1");
            }
            emptyListPreference.setSummary(emptyListPreference.getEntries()[emptyListPreference.findIndexOfValue(emptyListPreference.getValue())]);
            emptyListPreference.setOnPreferenceClickListener(new jdd());
        }
        if (arguments != null && (string = arguments.getString("pref_open_setting_page")) != null) {
            PreferenceScreen preferenceScreen5 = (PreferenceScreen) findPreference("prefscreen_top");
            Preference preferenceFindPreference = findPreference(string);
            if (preferenceFindPreference != null) {
                ListAdapter rootAdapter = getPreferenceScreen().getRootAdapter();
                while (true) {
                    if (i3 >= rootAdapter.getCount()) {
                        i3 = -1;
                        break;
                    } else if (((Preference) rootAdapter.getItem(i3)).getKey().equals(string)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 != -1) {
                    PreferenceScreen preferenceScreen6 = (PreferenceScreen) preferenceFindPreference;
                    f(preferenceScreen6);
                    Intent intent = preferenceScreen6.getIntent();
                    if (getActivity().getCallingActivity() != null) {
                        intent.setFlags(33554432);
                    }
                    preferenceScreen6.setIntent(intent);
                    preferenceScreen5.onItemClick(null, null, i3, 0L);
                }
            }
            if (arguments.getBoolean("pref_make_setting_page_root")) {
                getActivity().finish();
            }
        }
        ?? r12 = this.d.m;
        for (String str16 : r12.r()) {
            PreferenceGroup preferenceGroup = (PreferenceGroup) findPreference(str16);
            for (Preference preference2 : ((ryl) r12).b(str16)) {
                if (preferenceGroup.addPreference(preference2)) {
                    preference2.getTitle();
                } else {
                    ((sgt) CameraSettingsActivity.s.c().M(2680)).v("Could not add %s", preference2.getTitle());
                }
            }
        }
        Iterator it2 = this.d.g.iterator();
        while (it2.hasNext()) {
            nbf nbfVar = (nbf) findPreference((String) it2.next());
            if (nbfVar != null) {
                nbfVar.a(new idh(this.a, 8));
            }
        }
        CameraSettingsActivity.u(this.a.n, getPreferenceScreen());
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.List] */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) throws NumberFormatException {
        if (this.d.f.contains("pref_category_custom_hotkeys")) {
            return;
        }
        HashMap map = this.h;
        if (map.containsKey(str)) {
            String string = findPreference(str).getSharedPreferences().getString(str, "-1");
            map.put(str, string);
            int i = Integer.parseInt(string);
            if (i == 24 || i == 25) {
                ((ListPreference) findPreference(luf.j.a)).setValue(getResources().getString(com.google.ar.core.R.string.preference_volume_key_off));
            }
            if (!string.equals("-1") && map.containsValue(string)) {
                HashMap map2 = new HashMap();
                for (String str2 : map.keySet()) {
                    if (!str2.equals(str) && ((String) map.get(str2)).equals(string)) {
                        map2.put(str2, "-1");
                        ((KeyListenerPreference) findPreference(str2)).b("-1");
                    }
                }
                map.putAll(map2);
            }
        }
        if (str.equals(luf.j.a) && !((ListPreference) findPreference(str)).getValue().equals(getResources().getString(com.google.ar.core.R.string.preference_volume_key_off))) {
            HashMap map3 = new HashMap();
            for (String str3 : map.keySet()) {
                int i2 = Integer.parseInt((String) map.get(str3));
                if (i2 == 25 || i2 == 24) {
                    map3.put(str3, "-1");
                    ((KeyListenerPreference) findPreference(str3)).b("-1");
                }
            }
            map.putAll(map3);
        }
        if (str.equals(luf.aY.a)) {
            CameraSettingsActivity.t(this, this.a, this.d);
        }
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, owq] */
    @Override // android.app.Fragment
    public final void onResume() throws Resources.NotFoundException {
        String string;
        int i;
        super.onResume();
        Activity activity = getActivity();
        g("pref_category_advanced");
        String str = KsvNaXS.swmBlkRicTJVbV;
        g(str);
        g("pref_category_developer");
        g("pref_category_frequent_faces");
        g("pref_category_storage");
        g("pref_category_boba_jelly");
        g("pref_category_hotshot_key");
        g("pref_category_hotshot_non_talkback_key");
        PreferenceScreen preferenceScreen = (PreferenceScreen) findPreference("pref_category_frequent_faces");
        if (preferenceScreen != null) {
            hbp hbpVar = this.a.o;
            Object obj = hbpVar.c;
            ?? r7 = hbpVar.a;
            Resources resources = ((Context) obj).getResources();
            if (true != ((Boolean) r7.dL()).booleanValue()) {
                i = com.google.ar.core.R.string.frequent_faces_off;
            } else {
                i = com.google.ar.core.R.string.frequent_faces_on;
            }
            preferenceScreen.setSummary(resources.getString(i));
        }
        PreferenceScreen preferenceScreen2 = (PreferenceScreen) findPreference("pref_category_hotshot_key");
        if (preferenceScreen2 != null) {
            preferenceScreen2.setSummary(this.a.p.n(luf.p));
        }
        PreferenceScreen preferenceScreen3 = (PreferenceScreen) findPreference("pref_category_hotshot_non_talkback_key");
        if (preferenceScreen3 != null) {
            preferenceScreen3.setSummary(this.a.p.n(luf.q));
        }
        if (!this.d.f.contains("pref_category_custom_hotkeys")) {
            g("pref_category_custom_hotkeys");
        }
        Preference preferenceFindPreference = findPreference(str);
        if (findPreference(luf.h.a) != null) {
            string = getResources().getString(com.google.ar.core.R.string.pref_gestures_summary, getResources().getString(com.google.ar.core.R.string.pref_camera_volume_key_action_title), getResources().getString(com.google.ar.core.R.string.pref_camera_double_tap_action_title));
        } else {
            string = getResources().getString(com.google.ar.core.R.string.pref_camera_volume_key_action_title);
        }
        preferenceFindPreference.setSummary(string);
        Preference preferenceFindPreference2 = findPreference("pref_category_storage");
        if (preferenceFindPreference2 != null) {
            preferenceFindPreference2.setSummary(getResources().getString(com.google.ar.core.R.string.pref_storage_summary, getResources().getString(com.google.ar.core.R.string.pref_low_storage_mode), getResources().getString(com.google.ar.core.R.string.pref_free_up_space)));
        }
        ListPreference listPreference = (ListPreference) findPreference(luf.d.a);
        listPreference.setSummary(listPreference.getEntries()[listPreference.findIndexOfValue(listPreference.getValue())]);
        int i2 = 4;
        listPreference.setOnPreferenceChangeListener(new jdb(this, i2));
        findPreference("pref_launch_help").setOnPreferenceClickListener(new hfh(activity, 3));
        Preference preferenceFindPreference3 = findPreference("pref_launch_feedback");
        if (preferenceFindPreference3 != null) {
            preferenceFindPreference3.setOnPreferenceClickListener(new hfh(activity, i2));
        }
        PreferenceCategory preferenceCategory = (PreferenceCategory) findPreference("pref_category_resolution_camera");
        if (preferenceCategory != null) {
            Preference preferenceFindPreference4 = preferenceCategory.findPreference("pref_camera_resolution");
            Preference preferenceFindPreference5 = preferenceCategory.findPreference(luf.s.a);
            if (preferenceFindPreference4 != null) {
                preferenceCategory.removePreference(preferenceFindPreference4);
                preferenceCategory.addPreference(preferenceFindPreference4);
            }
            if (preferenceFindPreference5 != null) {
                preferenceCategory.removePreference(preferenceFindPreference5);
                preferenceCategory.addPreference(preferenceFindPreference5);
            }
        }
        getPreferenceScreen().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
        if (!b()) {
            a();
        }
        ManagedSwitchPreference managedSwitchPreference = this.g;
        if (managedSwitchPreference != null) {
            managedSwitchPreference.setEnabled(true);
        }
        CameraSettingsActivity.t(this, this.a, this.d);
    }
}

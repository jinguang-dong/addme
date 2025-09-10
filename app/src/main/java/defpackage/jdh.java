package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.preference.ListPreference;
import android.preference.SwitchPreference;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.camera.ui.preference.ManagedSwitchPreference;
import com.google.ar.core.R;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jdh {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;

    public jdh(ijb ijbVar, iki ikiVar, our ourVar, ndj ndjVar, ijo ijoVar, fvu fvuVar, itl itlVar, ija ijaVar, pau pauVar, hbj hbjVar, ocq ocqVar, ikp ikpVar) {
        this.b = ijbVar;
        this.f = ikiVar;
        this.m = ourVar;
        this.e = ndjVar;
        this.a = fvuVar;
        this.c = itlVar;
        this.k = ijaVar;
        this.j = hbjVar;
        this.i = pauVar;
        this.h = ikpVar;
        this.l = new ijc(ijoVar);
        this.d = new ijd(this, 0);
        this.g = new ije(ocqVar, ijoVar, hbjVar);
    }

    static final void d() {
        gzg gzgVar = gzt.a;
    }

    final int a() {
        return ((Integer) ((luj) this.i).b(luf.l)).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v68, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v81, types: [java.lang.Object, owq] */
    public final void b(Context context) {
        boolean z = false;
        for (pka pkaVar : pka.values()) {
            pkc pkcVar = (pkc) this.k;
            if (pkcVar.j(pkaVar)) {
                pjr pjrVarE = pkcVar.e(pkaVar);
                pjrVarE.getClass();
                z = z || pkcVar.f(pjrVarE).N();
            }
        }
        Object obj = this.l;
        gzi gziVar = gym.a;
        ?? r1 = this.f;
        r1.add(luf.S.a);
        hbj hbjVar = (hbj) obj;
        if (!hbjVar.p(hae.r) || !hbjVar.o(gzo.bC)) {
            r1.add("pref_camera_raw_output_option_available_key");
        }
        if (!hbjVar.p(gyp.b)) {
            r1.add(luf.u.a);
        }
        gzi gziVar2 = gyg.a;
        if (!hbjVar.p(gzo.aT)) {
            r1.add("pref_camera_selfie_mirror_key");
        }
        int i = gyu.a;
        r1.add(luf.s.a);
        r1.add("pref_category_developer");
        if (!z) {
            r1.add(luf.O.a);
        }
        gzi gziVar3 = hax.a;
        r1.add(luf.P.a);
        if (!hbjVar.p(gym.o) || !((pfl) this.h).a()) {
            r1.add(luf.Q.a);
        }
        r1.add(luf.R.a);
        if (!((pkc) this.k).i()) {
            Object obj2 = this.j;
            lur lurVar = luf.k;
            ((luj) obj2).d(lurVar, true);
            r1.add(lurVar.a);
        }
        r1.add("pref_category_custom_hotkeys");
        if (!hbjVar.p(gzo.aY) && !hbjVar.p(gzo.aZ)) {
            r1.add("pref_camera_dynamic_depth_enabled_key");
        }
        if (!hbjVar.p(gzb.b)) {
            r1.add("pref_category_frequent_faces");
        }
        if (!hbjVar.p(hac.T)) {
            r1.add("pref_camera_kepler_enabled_key");
        }
        if (!hbjVar.p(hac.L)) {
            r1.add(luf.bd.a);
        }
        if (!hbjVar.p(gzo.bm)) {
            r1.add("pref_camera_cd_indicator_enabled_key");
        }
        if (!hbjVar.p(gzs.F)) {
            r1.add(luf.aT.a);
        }
        if (!hbjVar.p(gze.n)) {
            r1.add(luf.aY.a);
        }
        gzg gzgVar = gzt.a;
        boolean z2 = hbjVar.p(gzgVar) && ((AccessibilityManager) this.a).isTouchExplorationEnabled();
        boolean z3 = hbjVar.p(gzgVar) && hbjVar.p(gzt.c) && !((AccessibilityManager) this.a).isTouchExplorationEnabled();
        if (!z2) {
            r1.add("pref_category_hotshot_key");
            r1.add(luf.p.a);
        }
        if (!z3) {
            r1.add("pref_category_hotshot_non_talkback_key");
            r1.add(luf.q.a);
        }
        if (!hbjVar.o(gzo.bA)) {
            r1.add("pref_camera_resolution");
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager.isPermissionRevokedByPolicy("android.permission.ACCESS_COARSE_LOCATION", context.getPackageName()) || packageManager.isPermissionRevokedByPolicy("android.permission.ACCESS_FINE_LOCATION", context.getPackageName())) {
            r1.add(luf.b.a);
        }
        if (!hbjVar.p(gym.ac)) {
            this.b.a(false);
            r1.add("pref_audio_zoom_key");
        }
        if (!hbjVar.p(gzo.bz)) {
            r1.add(luf.aZ.a);
        }
        if (!hbjVar.p(gyo.f)) {
            r1.add(luf.l.a);
            r1.add(luf.n.a);
        } else if (hbjVar.p(gyo.g)) {
            r1.add(luf.l.a);
        } else {
            r1.add(luf.n.a);
        }
        if (!hbjVar.p(gzy.j) || hbjVar.p(gzy.o)) {
            r1.add(luf.r.a);
        }
        ?? r3 = this.g;
        r3.add("pref_camera_resolution");
        r3.add("pref_camera_dynamic_depth_enabled_key");
        r3.add(luf.Q.a);
        if (!hbjVar.p(gzo.bl)) {
            r1.add(luf.h.a);
        }
        if (Collection.EL.stream(this.c).anyMatch(new hzk(10))) {
            r1.add("pref_launch_feedback");
        }
        gzg gzgVar2 = gza.a;
        r1.add(luf.ba.a);
        String str = hbb.a;
        r1.add("pref_category_boba_jelly");
        sgj sgjVarListIterator = ((sfd) this.d).listIterator();
        while (sgjVarListIterator.hasNext()) {
            lvh lvhVar = (lvh) sgjVarListIterator.next();
            if (((String) lvhVar.h().get(0)).equals("PhotoResolution")) {
                ListPreference listPreference = new ListPreference(context);
                listPreference.setTitle(lvhVar.e());
                listPreference.setEntries(lvhVar.a());
                listPreference.setEntryValues(lvhVar.b());
                listPreference.setKey(lvhVar.g());
                listPreference.setDefaultValue(lvhVar.f());
                listPreference.setIcon(lvhVar.c());
                listPreference.setSummary(lvhVar.d());
                listPreference.setLayoutResource(R.layout.preference_with_margin);
                listPreference.setOrder(3);
                ((ryg) this.m).o("pref_category_resolution_camera", listPreference);
            }
        }
        sgj sgjVarListIterator2 = ((sfd) this.e).listIterator();
        while (sgjVarListIterator2.hasNext()) {
            lvi lviVar = (lvi) sgjVarListIterator2.next();
            if (((String) lviVar.e().get(0)).equals("Advanced")) {
                SwitchPreference switchPreference = new SwitchPreference(context);
                switchPreference.setTitle(lviVar.b());
                switchPreference.setSummary(lviVar.a());
                switchPreference.setKey(lviVar.d());
                switchPreference.setDefaultValue(lviVar.c());
                ManagedSwitchPreference managedSwitchPreference = new ManagedSwitchPreference(context);
                managedSwitchPreference.setDefaultValue(true);
                managedSwitchPreference.setKey(switchPreference.getKey());
                managedSwitchPreference.setSummary(switchPreference.getSummary());
                managedSwitchPreference.setTitle(switchPreference.getTitle());
                managedSwitchPreference.setIcon(switchPreference.getIcon());
                managedSwitchPreference.b = switchPreference.getOnPreferenceChangeListener();
                managedSwitchPreference.setOrder(switchPreference.getOrder());
                managedSwitchPreference.setLayoutResource(R.layout.preference_with_margin);
                ((ryg) this.m).o("pref_category_advanced", managedSwitchPreference);
            }
        }
    }

    final boolean c() {
        return ((Boolean) ((luj) this.i).b(luf.Q)).booleanValue();
    }

    public jdh(pkc pkcVar, hbj hbjVar, pfl pflVar, luj lujVar, luj lujVar2, AccessibilityManager accessibilityManager, owq owqVar, Set set, Set set2, Set set3) {
        this.m = new sax();
        this.f = new ArrayList(10);
        this.g = new HashSet();
        this.k = pkcVar;
        this.l = hbjVar;
        this.h = pflVar;
        this.i = lujVar;
        this.j = lujVar2;
        this.a = accessibilityManager;
        this.b = owqVar;
        this.c = set;
        this.d = set2;
        this.e = set3;
    }

    public jdh(uem uemVar, uem uemVar2, uem uemVar3, uem uemVar4, uem uemVar5, uem uemVar6, uem uemVar7, uem uemVar8, uem uemVar9, uem uemVar10, uem uemVar11, uem uemVar12, uem uemVar13) {
        uemVar.getClass();
        this.b = uemVar;
        uemVar2.getClass();
        this.k = uemVar2;
        uemVar3.getClass();
        this.j = uemVar3;
        uemVar4.getClass();
        this.c = uemVar4;
        uemVar5.getClass();
        this.h = uemVar5;
        uemVar6.getClass();
        this.m = uemVar6;
        uemVar7.getClass();
        this.i = uemVar7;
        this.g = uemVar8;
        uemVar9.getClass();
        this.a = uemVar9;
        uemVar10.getClass();
        this.l = uemVar10;
        uemVar11.getClass();
        this.d = uemVar11;
        uemVar12.getClass();
        this.f = uemVar12;
        uemVar13.getClass();
        this.e = uemVar13;
    }
}

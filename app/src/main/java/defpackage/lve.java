package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.camera.jni.facebeautification.GFS.CZAHo;
import com.google.ar.core.R;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lve extends lvl {
    private static final sgv b = sgv.g("lve");
    private final Context c;
    private final luw d;
    private final fuf e;
    private final kgn f;
    private final pkc g;
    private final hbj h;

    public lve(Context context, kgn kgnVar, pkc pkcVar, luw luwVar, hbj hbjVar, fuf fufVar) {
        super("pref_upgrade_version", 27);
        this.c = context;
        this.f = kgnVar;
        this.g = pkcVar;
        this.h = hbjVar;
        this.d = luwVar;
        this.e = fufVar;
    }

    private final void e(pka pkaVar, luk lukVar) {
        String strB = lvo.b(pkaVar);
        if (strB == null) {
            ((sgt) b.c().M(4440)).s("Ignoring attempt to upgrade size of unhandled camera facing direction");
            return;
        }
        pas pasVarBL = ojl.bL(lukVar.d(strB));
        pkc pkcVar = this.g;
        pjr pjrVarE = pkcVar.e(pkaVar);
        if (pasVarBL == null || pjrVarE == null || !pae.i(pasVarBL).l(pae.a)) {
            return;
        }
        kgw kgwVarO = kzz.o(pjrVarE, pkcVar, this.f, this.h);
        pas pasVarA = lvo.a(null, kgwVarO.y(256), kgwVarO.l());
        if (pasVarA != null) {
            lukVar.i(strB, ojl.bN(pasVarA));
        }
    }

    private final void f(luk lukVar, String str) {
        if (lukVar.l(str)) {
            lukVar.i(str, this.c.getString(R.string.pref_camera_video_flashmode_off));
        }
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [sgt, shi] */
    @Override // defpackage.lvl
    public final void a(luk lukVar, int i) {
        String strD;
        boolean z;
        if (i < 5) {
            SharedPreferences sharedPreferencesC = lukVar.c();
            SharedPreferences sharedPreferencesN = lukVar.n();
            String str = luf.b.a;
            if (sharedPreferencesC.contains(str)) {
                Map<String, ?> all = sharedPreferencesC.getAll();
                if (all.containsKey(str) && !(all.get(str) instanceof String)) {
                    try {
                        z = sharedPreferencesC.getBoolean(str, false);
                    } catch (ClassCastException e) {
                        ((sgt) ((sgt) lvl.a.b().i(e)).M((char) 4451)).s("error reading old value, removing and returning default");
                        z = false;
                    }
                    sharedPreferencesC.edit().remove(str).apply();
                    lukVar.j(luf.b.a, z);
                }
            }
            if (sharedPreferencesN.contains("pref_camera_hdr_plus_key") && "on".equals(c(sharedPreferencesN, "pref_camera_hdr_plus_key"))) {
                lukVar.j("pref_camera_hdr_plus_key", true);
            }
        }
        if (i < 2) {
            SharedPreferences sharedPreferencesN2 = lukVar.n();
            String str2 = luf.b.a;
            if (lukVar.l(str2)) {
                if (!lukVar.k(str2)) {
                    lukVar.f(str2);
                }
            } else if (sharedPreferencesN2.contains(str2) && "on".equals(c(sharedPreferencesN2, str2))) {
                lukVar.j(str2, true);
            }
        }
        if (i < 3) {
            g(lukVar, pka.FRONT);
            g(lukVar, pka.BACK);
        }
        if (i < 8 && lukVar.l("pref_camera_hdr_plus_key")) {
            String strD2 = lukVar.d("pref_camera_hdr_plus_key");
            Boolean bool = "1".equals(strD2) ? Boolean.TRUE : "0".equals(strD2) ? Boolean.FALSE : null;
            if (bool != null) {
                lukVar.i("pref_camera_hdr_plus_key", true != bool.booleanValue() ? "off" : "on");
            }
        }
        if (i < 9 && lukVar.l("pref_camera_hdr_plus_key") && (strD = lukVar.d("pref_camera_hdr_plus_key")) != null && !strD.equals("on") && !strD.equals("off") && !strD.equals("auto")) {
            lukVar.f("pref_camera_hdr_plus_key");
        }
        if (i < 12) {
            e(pka.FRONT, lukVar);
            e(pka.BACK, lukVar);
        }
        if (i < 13 && lukVar.l("pref_camera_flashmode_key")) {
            String strD3 = lukVar.d("pref_camera_flashmode_key");
            lukVar.i(luf.v.a, strD3);
            lukVar.i(luf.x.a, strD3);
            lukVar.f("pref_camera_flashmode_key");
        }
        if (i < 14) {
            if (lukVar.l("pref_camera_video_flashmode_key")) {
                String strD4 = lukVar.d("pref_camera_video_flashmode_key");
                lukVar.i(luf.E.a, strD4);
                lukVar.i(luf.F.a, strD4);
                lukVar.f("pref_camera_video_flashmode_key");
            }
            String str3 = luf.K.a;
            if (lukVar.l("pref_camera_video_flashmode_thermally_disabled_key")) {
                lukVar.i(str3, lukVar.d("pref_camera_video_flashmode_thermally_disabled_key"));
                lukVar.f("pref_camera_video_flashmode_thermally_disabled_key");
            }
        }
        if (i < 16 && this.h.p(gzo.T)) {
            String str4 = luf.v.a;
            if (lukVar.l(str4)) {
                lukVar.i(str4, this.c.getString(R.string.pref_camera_video_flashmode_off));
            }
        }
        if (i < 17) {
            f(lukVar, luf.x.a);
            f(lukVar, luf.v.a);
        }
        if (i < 18 && !this.h.o(haf.c)) {
            String str5 = kox.AUTO.d;
            String str6 = luf.x.a;
            if (str5.equals(lukVar.d(str6))) {
                f(lukVar, str6);
            }
        }
        if (i < 19 && lukVar.l("pref_camera_dynamic_depth_enabled_key")) {
            lukVar.j("pref_camera_dynamic_depth_enabled_key", false);
        }
        if (i < 20) {
            String str7 = luf.V.a;
            String strD5 = lukVar.d("pref_video_quality_back_key");
            if (strD5 != null && strD5.contentEquals(this.c.getString(R.string.pref_video_quality_large)) && !lukVar.l(str7)) {
                lukVar.j(str7, true);
            }
        }
        if (i < 21) {
            String str8 = luf.V.a;
            boolean zK = lukVar.k(str8);
            lukVar.f(str8);
            if (zK) {
                this.d.a(lty.RES_2160P);
            }
        }
        if (i < 22 && this.e.a) {
            lukVar.i(luf.x.a, "ns");
            lukVar.i(luf.v.a, "ns");
        }
        if (i < 23 && !this.h.p(gzo.Q)) {
            lukVar.i("pref_video_fps_p2018_key", ltt.FPS_30.name());
            lukVar.i("pref_video_resolution", lty.RES_1080P.name());
        }
        if (i < 24 && !this.h.p(gzo.bl)) {
            lukVar.i(luf.h.a, "zoom");
        }
        if (i < 25 && !this.h.o(gzo.bA)) {
            lukVar.i("pref_camera_resolution", "full");
        }
        if (i < 26 && !this.h.o(gzo.bC)) {
            lukVar.j("pref_camera_raw_output_option_available_key", true);
        }
        if (i < 27) {
            lukVar.j("pref_camera_raw_output_key", false);
        }
    }

    @Override // defpackage.lvl
    protected final int b(luk lukVar) {
        SharedPreferences sharedPreferencesC = lukVar.c();
        if (sharedPreferencesC.contains("pref_strict_upgrade_version")) {
            Object obj = sharedPreferencesC.getAll().get("pref_strict_upgrade_version");
            sharedPreferencesC.edit().remove("pref_strict_upgrade_version").apply();
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            if (obj instanceof String) {
                return Integer.parseInt((String) obj);
            }
        }
        return super.b(lukVar);
    }

    private final void g(luk lukVar, pka pkaVar) {
        lukVar.getClass();
        pkaVar.getClass();
        String strB = lvo.b(pkaVar);
        if (strB == null) {
            ((sgt) b.c().M(4443)).s("Ignoring attempt to upgrade size of unhandled camera facing direction");
            return;
        }
        pkc pkcVar = this.g;
        pjr pjrVarE = pkcVar.e(pkaVar);
        if (pjrVarE == null) {
            ((sgt) b.c().M(4442)).v(CZAHo.EnylYDZCoGhGw, pkaVar);
            lukVar.f(strB);
            return;
        }
        kgw kgwVarO = kzz.o(pjrVarE, pkcVar, this.f, this.h);
        pas pasVarA = lvo.a(lukVar.d(strB), kgwVarO.y(256), kgwVarO.l());
        if (pasVarA != null) {
            lukVar.i(strB, ojl.bN(pasVarA));
        }
    }
}

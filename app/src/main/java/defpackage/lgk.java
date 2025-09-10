package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.PortraitRequest;
import com.google.googlex.gcam.StaticMetadata;
import com.google.googlex.gcam.StringStaticMetadataMap;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class lgk {
    public static final sgv a = sgv.g("lgk");
    private final HashMap b = new HashMap();
    private final HashMap c = new HashMap();
    private final Context d;

    public lgk(Context context) {
        this.d = context;
    }

    public static boolean b(PortraitRequest portraitRequest) {
        StringStaticMetadataMap stringStaticMetadataMapB = portraitRequest.b();
        return new StaticMetadata(GcamModuleJNI.StringStaticMetadataMap_get(stringStaticMetadataMapB.a, stringStaticMetadataMapB, GcamModuleJNI.kRequestCameraPrimary_get()), false).g() == tcy.d;
    }

    public final lgi a(String str) {
        paq paqVarA;
        synchronized (this) {
            if (rnt.V(str)) {
                return lgi.a;
            }
            try {
                HashMap map = this.c;
                ouk oukVar = (ouk) map.get(str);
                if (oukVar == null || (paqVarA = oukVar.a()) == null) {
                    lgj lgjVar = new lgj(this.d.getAssets().openFd(str), 0);
                    this.b.put(str, lgjVar);
                    ouk oukVar2 = new ouk(lgjVar);
                    map.put(str, oukVar2);
                    return new lgi(str, (AssetFileDescriptor) lgjVar.a, oukVar2.a());
                }
                lgj lgjVar2 = (lgj) this.b.get(str);
                if (lgjVar2 != null) {
                    return new lgi(str, (AssetFileDescriptor) lgjVar2.a, paqVarA);
                }
                ((sgt) a.b().M(4139)).s("Unable to find asset file");
                return lgi.a;
            } catch (IOException | RuntimeException e) {
                ((sgt) ((sgt) a.b().i(e)).M(4138)).s("Unable to open asset file");
                return lgi.a;
            }
        }
    }
}

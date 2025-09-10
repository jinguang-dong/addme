package defpackage;

import android.content.pm.PackageInfo;
import android.hardware.camera2.CameraCharacteristics;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.StaticMetadata;
import com.google.googlex.gcam.StaticMetadataVector;
import com.google.googlex.gcam.hdrplus.NativeMetadataConverter;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hys {
    public static final sgv a = sgv.g("hys");
    private static final int[] b = new int[0];

    public static float a(StaticMetadataVector staticMetadataVector, tci tciVar) {
        tcy tcyVarG;
        float f = Float.POSITIVE_INFINITY;
        float f2 = -1.0f;
        for (int i = 0; i < staticMetadataVector.a(); i++) {
            StaticMetadata staticMetadataB = staticMetadataVector.b(i);
            if (staticMetadataB.e() == tciVar && (tcyVarG = staticMetadataB.g()) != tcy.o) {
                int i2 = tcyVarG.w;
                if (!GcamModuleJNI.IsLogical(i2) && GcamModuleJNI.IsRgb(i2)) {
                    float fStaticMetadata_FocalLength35mm = GcamModuleJNI.StaticMetadata_FocalLength35mm(staticMetadataB.a, staticMetadataB);
                    if (fStaticMetadata_FocalLength35mm > 0.0f) {
                        float fAbs = Math.abs((-28.0f) + fStaticMetadata_FocalLength35mm);
                        if (fAbs < f) {
                            f2 = fStaticMetadata_FocalLength35mm;
                            f = fAbs;
                        }
                    }
                }
            }
        }
        return f2;
    }

    public static boolean b(pjo pjoVar) {
        for (int i : (int[]) pjoVar.n(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES, b)) {
            if (i == 3) {
                return true;
            }
        }
        return false;
    }

    public static void c(PackageInfo packageInfo, StaticMetadata staticMetadata) {
        staticMetadata.n(packageInfo.packageName);
        staticMetadata.o(packageInfo.versionName);
    }

    public static StaticMetadata d(tcy tcyVar, StaticMetadata staticMetadata, int i, pjo pjoVar, hbj hbjVar) {
        StaticMetadata staticMetadata2 = new StaticMetadata(staticMetadata);
        int iIntValue = ((Integer) hbjVar.a(gyk.a).get()).intValue();
        GcamModuleJNI.ApplySensorBinning__SWIG_1(2, StaticMetadata.c(staticMetadata2), staticMetadata2);
        staticMetadata2.f().k(iIntValue);
        staticMetadata2.k(i);
        staticMetadata2.r(tcyVar);
        staticMetadata2.m(NativeMetadataConverter.c(NativeMetadataConverter.e(pjoVar, false, new pas(GcamModuleJNI.StaticMetadata_frame_raw_max_width_get(staticMetadata2.a, staticMetadata2), GcamModuleJNI.StaticMetadata_frame_raw_max_height_get(staticMetadata2.a, staticMetadata2)))));
        return staticMetadata2;
    }

    public static boolean e(hbj hbjVar) {
        return hbjVar.p(han.h);
    }

    public static void f(StaticMetadata staticMetadata, StaticMetadataVector staticMetadataVector) {
        staticMetadata.g();
        staticMetadataVector.c(staticMetadata);
    }
}

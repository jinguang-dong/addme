package defpackage;

import android.media.MediaFormat;
import com.google.ar.core.ImageMetadata;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jsw {
    private static final sgv a = sgv.g("jsw");

    public static MediaFormat a(pas pasVar, int i, float f, String str, boolean z, boolean z2) {
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(str, pasVar.a, pasVar.b);
        mediaFormatCreateVideoFormat.setInteger("bitrate", i);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", 30);
        mediaFormatCreateVideoFormat.setInteger("color-format", 21);
        int i2 = true != z2 ? 2 : 1;
        mediaFormatCreateVideoFormat.setInteger("color-standard", i2);
        mediaFormatCreateVideoFormat.setInteger("color-transfer", 3);
        mediaFormatCreateVideoFormat.setInteger("color-range", i2);
        mediaFormatCreateVideoFormat.setFloat("i-frame-interval", f);
        mediaFormatCreateVideoFormat.setInteger("oo.muxer.drop_initial_non_keyframes", 1);
        if (str.equals("video/hevc")) {
            mediaFormatCreateVideoFormat.setInteger("profile", 1);
            mediaFormatCreateVideoFormat.setInteger("level", ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
            return mediaFormatCreateVideoFormat;
        }
        if (str.equals("video/av01")) {
            mediaFormatCreateVideoFormat.setInteger("profile", 1);
            mediaFormatCreateVideoFormat.setInteger("level", 8192);
            return mediaFormatCreateVideoFormat;
        }
        if (z) {
            mediaFormatCreateVideoFormat.setInteger("profile", 8);
            mediaFormatCreateVideoFormat.setInteger("level", 32768);
        }
        return mediaFormatCreateVideoFormat;
    }

    public static pas b(boolean z, boolean z2, boolean z3) {
        return z ? z3 ? z2 ? hpi.f : hpi.e : z2 ? hpi.h : hpi.g : z2 ? hpi.d : hpi.c;
    }

    public static int c(hbj hbjVar, boolean z, boolean z2) throws NumberFormatException {
        if (z) {
            return z2 ? 76000000 : 38000000;
        }
        gzi gziVar = haa.e;
        Optional optionalA = hbjVar.a(gziVar);
        if (optionalA.isPresent()) {
            return ((Integer) optionalA.get()).intValue();
        }
        ((sgt) a.c().M(3055)).C("%s is not set, return default value %d.", gziVar.a, 19000000);
        return 19000000;
    }
}

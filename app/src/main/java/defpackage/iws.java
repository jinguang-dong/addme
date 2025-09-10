package defpackage;

import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.ShotMetadata;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iws implements paq {
    public final InterleavedImageU8 a;
    public final ShotMetadata b;
    public final lgn c;
    public final int d;

    public iws(InterleavedImageU8 interleavedImageU8, int i, ShotMetadata shotMetadata) {
        this.a = interleavedImageU8;
        this.d = i;
        this.b = shotMetadata;
        rvk rvkVar = rvk.a;
        this.c = new lgn(a(GcamModuleJNI.ShotMetadata_xmp_metadata_main_get(shotMetadata.a, shotMetadata)), a(GcamModuleJNI.ShotMetadata_xmp_metadata_extended_get(shotMetadata.a, shotMetadata)), rvkVar, rvkVar);
    }

    private static rwc a(String str) {
        return rnt.V(str) ? rvk.a : pqw.c(str);
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.a.h();
    }
}

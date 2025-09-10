package defpackage;

import com.google.googlex.gcam.CyclopsParameters;
import com.google.googlex.gcam.GrayImageS16;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.PortraitRequest;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.ShotParams;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ibl extends kle {
    void b(tcu tcuVar, ShotMetadata shotMetadata, List list, ShotParams shotParams);

    void c(InterleavedImageU8 interleavedImageU8, PortraitRequest portraitRequest, ShotMetadata shotMetadata, syu syuVar, our ourVar);

    void d(GrayImageS16 grayImageS16, ShotMetadata shotMetadata, List list);

    void e(tcu tcuVar, ShotMetadata shotMetadata, List list, ShotParams shotParams);

    void f(InterleavedImageU8 interleavedImageU8, ShotMetadata shotMetadata, List list, CyclopsParameters cyclopsParameters);
}

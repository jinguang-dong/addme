package defpackage;

import android.graphics.Bitmap;
import com.google.googlex.gcam.AeShotParams;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.SpatialGainMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kbk {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public kbk(ShotMetadata shotMetadata, int i, AeShotParams aeShotParams, SpatialGainMap spatialGainMap) {
        this.b = shotMetadata;
        this.a = i;
        this.c = aeShotParams;
        this.d = spatialGainMap;
    }

    public kbk(List list, List list2, Bitmap bitmap, int i) {
        this.d = list;
        this.b = list2;
        this.c = bitmap;
        this.a = i;
    }
}

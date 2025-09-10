package defpackage;

import android.hardware.camera2.MultiResolutionImageReader;
import android.util.Log;
import com.google.android.camera.experimental2024_system.ExperimentalMultiResolutionImageReaderExtensions;
import java.util.Collection;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pji implements por {
    public final MultiResolutionImageReader a;
    public final HashMap b;
    public final HashMap c;
    private final int d;
    private final int e;
    private final Long f;
    private final uly g;
    private final prh h;

    public pji(Collection collection, int i, int i2, Long l, prh prhVar) {
        MultiResolutionImageReader multiResolutionImageReader;
        collection.getClass();
        this.d = i;
        this.e = i2;
        this.f = l;
        this.h = prhVar;
        if (l == null || prhVar == null) {
            multiResolutionImageReader = new MultiResolutionImageReader(collection, i, i2);
        } else {
            long jLongValue = l.longValue();
            try {
            } catch (RuntimeException e) {
                Log.w("ForwardingExperimental", String.valueOf(e.getMessage()).concat(" This device doesn't support newMultiResolutionImageReaderInstance with usage flag. Creating one without usage flags."));
                multiResolutionImageReader = new MultiResolutionImageReader(collection, i, i2);
            }
            if (!nvr.a(nvr.a, 12)) {
                throw new RuntimeException("this device doesn't support newMultiResolutionImageReaderInstance with usage flag");
            }
            multiResolutionImageReader = ExperimentalMultiResolutionImageReaderExtensions.newInstance(collection, i, i2, jLongValue);
            multiResolutionImageReader.getClass();
        }
        this.a = multiResolutionImageReader;
        this.b = new HashMap();
        this.c = new HashMap();
        this.g = new uly(false, umc.a);
    }

    @Override // defpackage.por, defpackage.ri
    public final Object c(ukx ukxVar) {
        throw null;
    }

    @Override // defpackage.por, defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        if (this.g.c()) {
            return;
        }
        this.a.close();
    }
}

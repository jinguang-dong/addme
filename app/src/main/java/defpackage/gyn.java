package defpackage;

import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.HalAfMetadata;
import java.util.function.Supplier;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gyn implements Supplier {
    private final /* synthetic */ int a;

    public /* synthetic */ gyn(int i) {
        this.a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return Long.valueOf(ucl.a.fr().a());
            case 1:
                return Boolean.valueOf(ubn.a.fr().a());
            case 2:
                return Boolean.valueOf(ucl.a.fr().b());
            case 3:
                return Boolean.valueOf(ubt.a.fr().a());
            case 4:
                return Boolean.valueOf(ubw.a.fr().e());
            case 5:
                return Long.valueOf(ubz.a.fr().d());
            case 6:
                return Long.valueOf(ubz.a.fr().c());
            case 7:
                return Boolean.valueOf(ubz.a.fr().g());
            case 8:
                return ubz.a.fr().f();
            case 9:
                return Boolean.valueOf(ubw.a.fr().d());
            case 10:
                return Boolean.valueOf(ubq.a.fr().a());
            case 11:
                return Long.valueOf(ubw.a.fr().b());
            case 12:
                return Long.valueOf(ubw.a.fr().a());
            case 13:
                return Long.valueOf(ubw.a.fr().c());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return Long.valueOf(ubz.a.fr().e());
            case 15:
                return Long.valueOf(ubz.a.fr().b());
            case 16:
                return Long.valueOf(ubz.a.fr().a());
            case 17:
                return Boolean.valueOf(ucl.a.fr().c());
            case 18:
                return Boolean.valueOf(uci.a.fr().a());
            case 19:
                return Boolean.valueOf(ucc.a.fr().a());
            default:
                return new HalAfMetadata(GcamModuleJNI.new_HalAfMetadata(), true);
        }
    }
}

package defpackage;

import j$.util.Optional;
import java.util.concurrent.ExecutorService;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kor implements tzt {
    private final /* synthetic */ int a;

    public kor(int i) {
        this.a = i;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.a) {
            case 0:
                iao iaoVar = iao.PORTRAIT;
                iaoVar.getClass();
                return iaoVar;
            case 1:
                int i = kok.a;
                return rvk.a;
            case 2:
                return new kgk(owp.a(1));
            case 3:
                pet petVar = pet.SURFACE_DEFERRED;
                petVar.getClass();
                return petVar;
            case 4:
                return rvk.a;
            case 5:
                return new lcw();
            case 6:
                return new lfe();
            case 7:
                return rvk.a;
            case 8:
                lkk lkkVar = lkk.AUTO;
                lkkVar.getClass();
                return lkkVar;
            case 9:
                return new lpa();
            case 10:
                return new mff();
            case 11:
                return a.R();
            case 12:
                return a.O();
            case 13:
                return new ovx(ixq.INACTIVE);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new ovx(ixq.INACTIVE);
            case 15:
                return a.O();
            case 16:
                ExecutorService executorServiceBZ = ojl.bZ("CheetahExecutor");
                executorServiceBZ.getClass();
                return executorServiceBZ;
            case 17:
                return new our();
            case 18:
                return Optional.empty();
            case 19:
                return a.R();
            default:
                return Optional.empty();
        }
    }
}

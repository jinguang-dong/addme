package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jvy implements tzt {
    private final /* synthetic */ int a;

    public jvy(int i) {
        this.a = i;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.a) {
            case 2:
                Optional.empty();
                break;
            case 3:
                Optional.empty();
                Optional.empty();
                break;
            case 4:
                Optional.empty();
                Optional.of(new CameraCharacteristics.Key("restrictedStreamConfigurations", int[].class));
                break;
            case 5:
                Set setSynchronizedSet = DesugarCollections.synchronizedSet(new HashSet());
                setSynchronizedSet.getClass();
                break;
            case 6:
                ExecutorService executorServiceBW = ojl.bW("mts-fast-hdr");
                executorServiceBW.getClass();
                break;
            case 8:
                ExecutorService executorServiceBZ = ojl.bZ("mts-launcher");
                executorServiceBZ.getClass();
                break;
            case 10:
                ExecutorService executorServiceBZ2 = ojl.bZ("mts-reprocess");
                executorServiceBZ2.getClass();
                break;
        }
        return a.O();
    }
}

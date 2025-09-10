package defpackage;

import com.google.googlex.gcam.creativecamera.portraitmode.NativePortraitSegmenterInterface;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pls implements tzt {
    private final /* synthetic */ int a;

    public pls(int i) {
        this.a = i;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.a) {
            case 0:
                int i = plo.a;
                ovc ovcVarA = ovd.a();
                ovcVarA.a = "CXCP";
                ovcVarA.b(-1);
                ovcVarA.c(plo.a);
                return ojl.ca(ovcVarA.a());
            case 1:
                int i2 = plo.a;
                ovc ovcVarA2 = ovd.a();
                ovcVarA2.a = "CXCP-IO";
                ovcVarA2.b(-1);
                ovcVarA2.c(8);
                return ojl.ca(ovcVarA2.a());
            case 2:
                return new pna();
            case 3:
                return pnp.a();
            case 4:
                return new prh();
            case 5:
                return pnq.b();
            case 6:
                qpf qpfVar = pnr.a;
                qpfVar.getClass();
                return qpfVar;
            case 7:
                ExecutorService executorServiceBY = ojl.bY("MediaFS-IO", 2);
                executorServiceBY.getClass();
                return executorServiceBY;
            case 8:
                return ojl.cb("MediaFS", 2);
            case 9:
                return new qpt((byte[]) null);
            case 10:
                return new qaq(new pxl());
            case 11:
                return new qnl();
            case 12:
                return qpb.a;
            case 13:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return true;
            case 15:
                syw sywVarA = ske.A(Executors.newCachedThreadPool());
                sywVarA.getClass();
                return sywVarA;
            case 16:
                return rek.a;
            default:
                return new NativePortraitSegmenterInterface();
        }
    }
}

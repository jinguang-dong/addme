package defpackage;

import android.graphics.Rect;
import android.util.Size;
import j$.util.DesugarArrays;
import java.text.NumberFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mvi implements tzt {
    private final /* synthetic */ int a;

    public mvi(int i) {
        this.a = i;
    }

    public static final qin b() {
        hbc hbcVarB = hmp.b();
        qkq qkqVar = qkq.a;
        hbc hbcVar = hbc.ENG;
        rnu rnuVarF = qpt.F();
        qfy qfyVar = new qfy("glvffx", qpt.ap());
        qfyVar.a();
        qiw qiwVar = new qiw(qfyVar, qfyVar);
        qiwVar.l(new qim(qiwVar, qpt.ai(qiwVar, new qix(qiwVar, qkqVar, rnuVarF, hbcVarB == hbcVar))));
        qjj qjjVar = new qjj(qiwVar);
        qjjVar.execute(new iyy(6));
        return qjjVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        int i;
        String str;
        mwv mwvVar;
        switch (this.a) {
            case 0:
                return new ovx(mwv.a().a());
            case 1:
                ExecutorService executorServiceBZ = ojl.bZ("hotshot-ob");
                executorServiceBZ.getClass();
                return executorServiceBZ;
            case 2:
                mww mwwVar = new mww();
                mwwVar.e = 8;
                mwwVar.a = 0;
                mwwVar.d = (byte) 1;
                mwwVar.b = "";
                mwwVar.c = mwv.a().a();
                if (mwwVar.d != 1 || (i = mwwVar.e) == 0 || (str = mwwVar.b) == null || (mwvVar = mwwVar.c) == null) {
                    throw new IllegalStateException();
                }
                return new ovx(new mwx(i, 0, str, mwvVar));
            case 3:
                return new ovx(new mwl[0]);
            case 4:
                return new mwc();
            case 5:
                return a.O();
            case 6:
                return new ovx(mxj.PHONE_LAYOUT);
            case 7:
                return new AtomicReference();
            case 8:
                return a.O();
            case 9:
                return new ovx(new Size(0, 0));
            case 10:
                return new ovx(new Rect());
            case 11:
                sbv sbvVar = (sbv) DesugarArrays.stream(mxk.values()).collect(ryv.a(new mcx(2), new mcx(3)));
                sbvVar.getClass();
                return sbvVar;
            case 12:
                return new ovx(new Size(0, 0));
            case 13:
                return new jea();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new qpt((byte[]) null);
            case 15:
                return new mwq();
            case 16:
                return new ngr();
            case 17:
                return a.O();
            case 18:
                NumberFormat numberFormat = NumberFormat.getInstance();
                numberFormat.setMinimumFractionDigits(1);
                numberFormat.setMaximumFractionDigits(1);
                numberFormat.getClass();
                return numberFormat;
            case 19:
                return new nnq();
            default:
                return b();
        }
    }
}

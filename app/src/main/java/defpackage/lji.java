package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Range;
import android.widget.TextView;
import com.google.ar.core.ImageFormat;
import com.google.ar.core.R;
import com.google.googlex.gcam.BurstSpec;
import j$.time.Instant;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lji implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lji(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, uhf] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void d(Object obj) {
        long j;
        switch (this.b) {
            case 0:
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                ljj ljjVar = (ljj) this.a;
                float fI = ljjVar.i(iIntValue);
                int iK = ljjVar.k(fI);
                if (iK != num.intValue()) {
                    ljjVar.m(iK);
                }
                ljjVar.o.g(fI, false, niz.a);
                break;
            case 1:
                lds ldsVar = (lds) obj;
                iby ibyVar = ldsVar.a;
                tcq tcqVar = hxy.a;
                BurstSpec burstSpec = new BurstSpec();
                ldt ldtVar = (ldt) this.a;
                ldtVar.d(ibyVar, burstSpec);
                ldtVar.b.m(ldsVar);
                break;
            case 2:
                ((nhz) obj).d((mxm) this.a);
                break;
            case 3:
                qpt.aQ((TextView) obj, (mxm) this.a);
                break;
            case 4:
                final nhz nhzVar = (nhz) obj;
                final lka lkaVar = (lka) this.a;
                nhzVar.c(new nja() { // from class: ljy
                    @Override // defpackage.nja
                    public final void a(float f, boolean z, niz nizVar) {
                        if (z) {
                            nhz nhzVar2 = nhzVar;
                            lka lkaVar2 = lkaVar;
                            Range range = (Range) lkaVar2.c.dL();
                            lkaVar2.d.a(Float.valueOf(ske.aj(((((Float) range.getUpper()).floatValue() - ((Float) range.getLower()).floatValue()) * f) + ((Float) range.getLower()).floatValue(), ((Float) range.getLower()).floatValue(), ((Float) range.getUpper()).floatValue())));
                            lkaVar2.k(nhzVar2);
                        }
                    }
                });
                break;
            case 5:
                nhz nhzVar2 = (nhz) obj;
                lka lkaVar2 = (lka) this.a;
                float fFloatValue = ((Float) lkaVar2.d.dL()).floatValue();
                Range range = (Range) lkaVar2.c.dL();
                float fAj = ske.aj((fFloatValue - ((Float) range.getLower()).floatValue()) / (((Float) range.getUpper()).floatValue() - ((Float) range.getLower()).floatValue()), 0.0f, 1.0f);
                nhzVar2.g(fAj, false, niz.a);
                lkaVar2.k(nhzVar2);
                sbv sbvVar = lkaVar2.h;
                sbvVar.getClass();
                ljz ljzVar = (ljz) sbvVar.get(lkaVar2.e.dL());
                if (ljzVar != null) {
                    ljzVar.b.setText(((double) fAj) < 0.01d ? ljzVar.c : lkaVar2.h(fAj));
                    break;
                }
                break;
            case 6:
                Long l = (Long) obj;
                long jLongValue = l.longValue();
                lkn lknVar = (lkn) this.a;
                float fI2 = lknVar.i(jLongValue);
                long jK = lknVar.k(fI2);
                if (jK != l.longValue()) {
                    lknVar.m(jK);
                }
                lknVar.i.g(fI2, false, niz.a);
                break;
            case 7:
                lle lleVar = (lle) this.a;
                lleVar.i.setText(lleVar.a.getString(R.string.iso_value, (Integer) obj));
                break;
            case 8:
                Long l2 = (Long) obj;
                lle lleVar2 = (lle) this.a;
                TextView textView = lleVar2.h;
                Object[] objArr = {qpt.bQ(l2.longValue())};
                Context context = lleVar2.a;
                textView.setText(context.getString(R.string.shutter_speed_value, objArr));
                lleVar2.h.setContentDescription(context.getString(R.string.shutter_speed_value_desc, qpt.bP(l2.longValue())));
                break;
            case 9:
                int i = llm.g;
                ((llo) obj).a().b((Throwable) this.a);
                break;
            case 10:
                ((lst) obj).d((ltd) this.a);
                break;
            case 11:
                ((lst) obj).n((ltd) this.a);
                break;
            case 12:
                ((lst) obj).eh((Bitmap) this.a);
                break;
            case 13:
                ((lst) obj).b((ltd) this.a);
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((lst) obj).c((ltd) this.a);
                break;
            case 15:
                ((lst) obj).j((ltd) this.a);
                break;
            case 16:
                ltf ltfVar = ltf.UNKNOWN;
                switch (((ltf) obj).ordinal()) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    case 20:
                        j = 25;
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 11:
                    case 15:
                    case 17:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    default:
                        j = 0;
                        break;
                    case 9:
                    case 19:
                        j = 26;
                        break;
                    case 10:
                        j = 24;
                        break;
                    case 12:
                        j = 11;
                        break;
                    case 13:
                        j = 29;
                        break;
                    case 16:
                        j = 17;
                        break;
                    case 18:
                        j = 14;
                        break;
                    case 21:
                        j = 23;
                        break;
                    case ImageFormat.RGBA_FP16 /* 22 */:
                        j = 22;
                        break;
                    case 27:
                        j = 3;
                        break;
                    case 28:
                        j = 27;
                        break;
                    case 29:
                        j = 4;
                        break;
                }
                tpc tpcVarM = raz.a.m();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                raz razVar = (raz) tpcVarM.b;
                razVar.b |= 1;
                razVar.c = j;
                long epochMilli = Instant.now().toEpochMilli();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                raz razVar2 = (raz) tpcVarM.b;
                razVar2.b |= 2;
                razVar2.d = epochMilli;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                Object obj2 = this.a;
                raz razVar3 = (raz) tpcVarM.b;
                razVar3.b |= 4;
                razVar3.e = jElapsedRealtime;
                tph tphVarL = tpcVarM.l();
                tphVarL.getClass();
                lat latVar = ((mdy) obj2).C;
                ukc.C(ung.j(latVar.c), null, 0, new crq(latVar, (raz) tphVarL, (uhb) null, 13), 3);
                break;
            case 17:
                float fFloatValue2 = ((Float) obj).floatValue();
                tpc tpcVar = (tpc) this.a;
                if (!tpcVar.b.C()) {
                    tpcVar.o();
                }
                srt srtVar = (srt) tpcVar.b;
                srt srtVar2 = srt.a;
                srtVar.b |= 1;
                srtVar.c = fFloatValue2;
                break;
            case 18:
                float fFloatValue3 = ((Float) obj).floatValue();
                tpc tpcVar2 = (tpc) this.a;
                if (!tpcVar2.b.C()) {
                    tpcVar2.o();
                }
                srt srtVar3 = (srt) tpcVar2.b;
                srt srtVar4 = srt.a;
                srtVar3.b |= 4;
                srtVar3.e = fFloatValue3;
                break;
            case 19:
                int iIntValue2 = ((Integer) obj).intValue();
                tpc tpcVar3 = (tpc) this.a;
                if (!tpcVar3.b.C()) {
                    tpcVar3.o();
                }
                srt srtVar5 = (srt) tpcVar3.b;
                srt srtVar6 = srt.a;
                srtVar5.b |= 8;
                srtVar5.f = iIntValue2;
                break;
            default:
                long jLongValue2 = ((Long) obj).longValue();
                tpc tpcVar4 = (tpc) this.a;
                if (!tpcVar4.b.C()) {
                    tpcVar4.o();
                }
                srt srtVar7 = (srt) tpcVar4.b;
                srt srtVar8 = srt.a;
                srtVar7.b |= 16;
                srtVar7.g = jLongValue2;
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}

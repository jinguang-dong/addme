package defpackage;

import android.content.ContentProviderOperation;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mdv implements rvu {
    private final /* synthetic */ int a;

    public /* synthetic */ mdv(int i) {
        this.a = i;
    }

    @Override // defpackage.rvu
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return rwc.j((srg) obj);
            case 1:
                ((sgt) lvz.a.c().M(4461)).u("waitForCamerasAllAvailable timed out after %dms", 60000L);
                return false;
            case 2:
                ((sgt) ((sgt) mdy.a.c().i((Throwable) obj)).M(4739)).s("LapEnvelope failed for changeScreen.");
                return rvk.a;
            case 3:
                muj mujVar = (muj) obj;
                sbp sbpVar = mzk.b;
                mujVar.getClass();
                return Boolean.valueOf(mujVar.b == 5);
            case 4:
                return ((mzv) obj).a;
            case 5:
                return Integer.valueOf(((mzv) obj).b);
            case 6:
                jjq jjqVar = (jjq) obj;
                if (jjqVar != null && jjqVar.h.isPresent()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    if (((Boolean) it.next()).booleanValue()) {
                        return true;
                    }
                }
                return false;
            case 8:
                List<Comparable> list = (List) obj;
                Comparable comparable = (Comparable) list.get(0);
                for (Comparable comparable2 : list) {
                    if (comparable.compareTo(comparable2) > 0) {
                        comparable = comparable2;
                    }
                }
                return comparable;
            case 9:
                long jLongValue = ((Long) obj).longValue();
                if (jLongValue <= 0) {
                    jLongValue = Long.MAX_VALUE;
                }
                return new oye(jLongValue);
            case 10:
                return piq.f((pmf) obj, null, true);
            case 11:
                ContentProviderOperation contentProviderOperation = (ContentProviderOperation) obj;
                String authority = contentProviderOperation.getUri().getAuthority();
                contentProviderOperation.getUri();
                authority.getClass();
                return authority;
            case 12:
                return new pxw((pts) obj);
            case 13:
                pwu pwuVar = (pwu) obj;
                tpc tpcVarM = svm.a.m();
                long j = pwuVar.a;
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                tph tphVar = tpcVarM.b;
                svm svmVar = (svm) tphVar;
                svmVar.b |= 1;
                svmVar.c = j;
                int i = pwuVar.e;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                int i3 = i2 != 0 ? i2 != 1 ? i2 != 2 ? 1 : 4 : 3 : 2;
                if (!tphVar.C()) {
                    tpcVarM.o();
                }
                tph tphVar2 = tpcVarM.b;
                svm svmVar2 = (svm) tphVar2;
                svmVar2.d = i3 - 1;
                svmVar2.b |= 2;
                boolean z = pwuVar.b;
                if (!tphVar2.C()) {
                    tpcVarM.o();
                }
                tph tphVar3 = tpcVarM.b;
                svm svmVar3 = (svm) tphVar3;
                svmVar3.b = 4 | svmVar3.b;
                svmVar3.e = z;
                boolean z2 = pwuVar.c;
                if (!tphVar3.C()) {
                    tpcVarM.o();
                }
                tph tphVar4 = tpcVarM.b;
                svm svmVar4 = (svm) tphVar4;
                svmVar4.b |= 8;
                svmVar4.f = z2;
                boolean z3 = pwuVar.d;
                if (!tphVar4.C()) {
                    tpcVarM.o();
                }
                tph tphVar5 = tpcVarM.b;
                svm svmVar5 = (svm) tphVar5;
                svmVar5.b |= 16;
                svmVar5.g = z3;
                int i4 = pwuVar.f;
                int i5 = i4 - 1;
                if (i4 == 0) {
                    throw null;
                }
                int i6 = i5 == 1 ? 2 : 1;
                if (!tphVar5.C()) {
                    tpcVarM.o();
                }
                svm svmVar6 = (svm) tpcVarM.b;
                svmVar6.h = i6 - 1;
                svmVar6.b |= 32;
                return (svm) tpcVarM.l();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return null;
            case 15:
                pts ptsVar = (pts) obj;
                ptsVar.getClass();
                return ptsVar;
            case 16:
                return (qaq) ((tzj) obj).a();
            case 17:
                return ((Boolean) obj).booleanValue() ? pyz.FILE_ALREADY_EXISTS_IN_ANDROID_SHARED_STORAGE : pyz.FILE_NOT_SHARED_IN_ANDROID_SHARED_STORAGE;
            case 18:
                return rwc.i((pvc) obj);
            case 19:
                return new qcs(true, obj, null);
            default:
                return new qcs(false, null, (Exception) obj);
        }
    }
}

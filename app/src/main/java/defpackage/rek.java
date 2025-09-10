package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rek extends reo {
    public static final reo a = new rek();

    private rek() {
    }

    @Override // defpackage.reo
    public final String a() {
        return "singleproc";
    }

    @Override // defpackage.reo
    public final /* synthetic */ rel b(rec recVar, String str, Executor executor, lat latVar) {
        tow towVarA;
        if (recVar.e) {
            towVarA = tow.a();
        } else {
            tow towVar = tow.a;
            tra traVar = tra.a;
            towVarA = tow.a;
        }
        res resVar = new res(recVar.b, towVarA);
        Uri uri = recVar.a;
        return new rel(str, ske.M(uri), resVar, executor, latVar, recVar.c);
    }
}

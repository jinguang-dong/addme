package defpackage;

import androidx.media3.muxer.NativeAnnexBToAvccConverter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jpt implements joe {
    @Override // defpackage.joe
    public final qez a(FileOutputStream fileOutputStream, int i, syu syuVar, rwc rwcVar, Executor executor) {
        try {
            czp czpVar = new czp(fileOutputStream);
            czpVar.a = 0;
            czpVar.b = new NativeAnnexBToAvccConverter();
            czpVar.c = true;
            czpVar.b();
            qaq qaqVar = new qaq(czpVar.a());
            qaqVar.c(new czd(i));
            qel qelVar = new qel(rwc.i(null), fileOutputStream, qaqVar, executor);
            syuVar.c(new pev(qelVar, syuVar, 8), qelVar.e);
            Object obj = ((rwg) rwcVar).a;
            qelVar.e("com.android.manufacturer", (String) ((jod) obj).a);
            qelVar.e("com.android.model", (String) ((jod) obj).b);
            return qelVar;
        } catch (IOException e) {
            throw new qen(e);
        }
    }
}

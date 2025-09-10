package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.libraries.pixel.tips.convtrak.ConversionEventWorker;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jui extends dwu {
    private final qqe a;

    public jui(qqe qqeVar) {
        this.a = qqeVar;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, tzx] */
    @Override // defpackage.dwu
    public final dwi a(Context context, String str, WorkerParameters workerParameters) throws ClassNotFoundException {
        Class<?> cls = Class.forName(str);
        cls.getClass();
        ukx ukxVarAx = ske.ax(cls);
        int i = ukb.a;
        if (a.ao(ukxVarAx, new uji(ConversionEventWorker.class))) {
            return new ConversionEventWorker(context, workerParameters, (rau) ((qqe) this.a.a).a.a());
        }
        return null;
    }
}

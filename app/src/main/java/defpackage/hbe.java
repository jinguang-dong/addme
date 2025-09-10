package defpackage;

import android.content.ContentResolver;
import j$.time.Duration;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hbe {
    public static final /* synthetic */ int a = 0;
    private static final sgv b = sgv.g("hbe");
    private static final Duration c = Duration.ofSeconds(2);
    private final Future d;

    public hbe(ContentResolver contentResolver, ScheduledExecutorService scheduledExecutorService, pbn pbnVar) {
        this.d = ske.T(ske.Q(pbnVar.d("Gservices.getStringsByPrefix", new kbs(contentResolver, 1)), scheduledExecutorService), c.toMillis(), TimeUnit.MILLISECONDS, scheduledExecutorService);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [sgt, shi] */
    public final String a(String str) {
        if (str == null) {
            return null;
        }
        String strConcat = "camera:".concat(str);
        try {
            return (String) ((Map) this.d.get()).get(strConcat);
        } catch (InterruptedException | ExecutionException e) {
            ((sgt) ((sgt) b.c().i(e)).M((char) 1093)).v("Failed to read gservices config %s. Returning null.", strConcat);
            return null;
        }
    }
}

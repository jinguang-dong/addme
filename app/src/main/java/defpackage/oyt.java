package defpackage;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.apps.camera.coach.YOHg.INRGuObcrHjSQz;
import com.google.android.apps.camera.ui.hotshot.yElM.PNlJufQ;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oyt {
    private final szh a = new szh();

    private static boolean c(long j, AtomicLong atomicLong) {
        return atomicLong.get() <= 0 || j - atomicLong.get() <= 3000000;
    }

    private final void b() {
        try {
            this.a.t(700L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.w("AuViEncoderStop", PNlJufQ.zIrRQslSpMui, e);
        }
    }

    public final void a(int i, long j, AtomicLong atomicLong, syu syuVar) throws TimeoutException {
        String.format(INRGuObcrHjSQz.bKDs, nwj.o(i), Long.valueOf(SystemClock.uptimeMillis() * 1000), Long.valueOf(atomicLong.get()));
        try {
            atomicLong.get();
            if (atomicLong.get() > 0 && !c(j, atomicLong)) {
                throw new TimeoutException(String.format("%s not waiting for last frame to arrive. [stop us: %d, last frame us: %d]", nwj.o(i), Long.valueOf(j), Long.valueOf(atomicLong.get())));
            }
            ((swn) syuVar).t(700L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            Log.w("AuViEncoderStop", String.format("%s Failed waiting for eos, stream may have stopped early (last frame: %d)", nwj.o(i), Long.valueOf(atomicLong.get())));
            c(j, atomicLong);
        }
        if (i == 2) {
            this.a.e(Long.valueOf(atomicLong.get()));
        } else {
            b();
        }
        String.format("Last %s frame timestamp: %d", nwj.o(i), Long.valueOf(atomicLong.get()));
    }
}

package defpackage;

import android.content.res.AssetManager;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.compose.foundation.text.modifiers.Yk.LmJPKwPBa;
import androidx.coordinatorlayout.widget.pcp.OPuAVreQM;
import com.google.android.apps.camera.coach.YOHg.INRGuObcrHjSQz;
import com.google.android.apps.camera.facemetadata.conversions.jni.HM.oUZhwRhE;
import com.google.android.apps.camera.focusindicator.CIAk.YyLACfm;
import com.google.android.apps.camera.imax.cyclops.audio.xcIh.cdVQ;
import com.google.android.apps.camera.jni.facebeautification.GFS.CZAHo;
import com.google.android.libraries.oliveoil.natives.TtaZ.VnmwoBe;
import com.google.googlex.gcam.dirtylens.PrCd.TOnSyMaYeslEl;
import com.google.vr.audio.Cf.qcjAcSmlN;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cue {
    private static final Set A;
    private static final HashMap B;
    private static final byte[] C;
    private static final rsj[] O;
    private static final rsj[] P;
    private static final rsj[] Q;
    private static final rsj[] R;
    private static final rsj[] S;
    private static final rsj T;
    private static final rsj[] U;
    private static final rsj[] V;
    private static final rsj[] W;
    private static final rsj[] X;
    private static final rsj[] Y;
    public static final int[] a;
    public static final int[] b;
    static final byte[] c;
    static final byte[] d;
    public static final String[] e;
    public static final int[] f;
    public static final byte[] g;
    public static final Charset h;
    static final byte[] i;
    static final rsj[][] k;
    private static final byte[] l;
    private static final byte[] m;
    private static final byte[] n;
    private static final byte[] o;
    private static final byte[] p;
    private static final byte[] q;
    private static final byte[] r;
    private static final byte[] s;
    private static final byte[] t;
    private static final byte[] u;
    private static final byte[] v;
    private static final SimpleDateFormat w;
    private static final SimpleDateFormat x;
    private static final HashMap[] y;
    private static final HashMap[] z;
    private final FileDescriptor D;
    private final AssetManager.AssetInputStream E;
    private int F;
    private final HashMap[] G;
    private final Set H;
    private boolean I;
    private int J;
    private int K;
    private int L;
    private int M;
    private cuc N;
    public ByteOrder j;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        a = new int[]{8, 8, 8};
        b = new int[]{8};
        c = new byte[]{-1, -40, -1};
        l = new byte[]{102, 116, 121, 112};
        m = new byte[]{109, 105, 102, 49};
        n = new byte[]{104, 101, 105, 99};
        o = new byte[]{97, 118, 105, 102};
        p = new byte[]{97, 118, 105, 115};
        q = new byte[]{79, 76, 89, 77, 80, 0};
        r = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        s = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        d = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
        t = new byte[]{82, 73, 70, 70};
        u = new byte[]{87, 69, 66, 80};
        v = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        e = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        g = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        rsj[] rsjVarArr = {new rsj(INRGuObcrHjSQz.VQEH, 254, 4), new rsj("SubfileType", 255, 4), new rsj("ImageWidth", 256, 3, 4), new rsj("ImageLength", 257, 3, 4), new rsj("BitsPerSample", 258, 3), new rsj("Compression", 259, 3), new rsj("PhotometricInterpretation", 262, 3), new rsj("ImageDescription", 270, 2), new rsj("Make", 271, 2), new rsj("Model", 272, 2), new rsj("StripOffsets", 273, 3, 4), new rsj("Orientation", 274, 3), new rsj("SamplesPerPixel", 277, 3), new rsj("RowsPerStrip", 278, 3, 4), new rsj("StripByteCounts", 279, 3, 4), new rsj("XResolution", 282, 5), new rsj("YResolution", 283, 5), new rsj("PlanarConfiguration", 284, 3), new rsj("ResolutionUnit", 296, 3), new rsj("TransferFunction", 301, 3), new rsj("Software", 305, 2), new rsj("DateTime", 306, 2), new rsj("Artist", 315, 2), new rsj("WhitePoint", 318, 5), new rsj("PrimaryChromaticities", 319, 5), new rsj("SubIFDPointer", 330, 4), new rsj("JPEGInterchangeFormat", 513, 4), new rsj("JPEGInterchangeFormatLength", 514, 4), new rsj("YCbCrCoefficients", 529, 5), new rsj("YCbCrSubSampling", 530, 3), new rsj("YCbCrPositioning", 531, 3), new rsj("ReferenceBlackWhite", 532, 5), new rsj("Copyright", 33432, 2), new rsj("ExifIFDPointer", 34665, 4), new rsj("GPSInfoIFDPointer", 34853, 4), new rsj("SensorTopBorder", 4, 4), new rsj("SensorLeftBorder", 5, 4), new rsj("SensorBottomBorder", 6, 4), new rsj("SensorRightBorder", 7, 4), new rsj("ISO", 23, 3), new rsj("JpgFromRaw", 46, 7), new rsj("Xmp", 700, 1)};
        O = rsjVarArr;
        rsj[] rsjVarArr2 = {new rsj("ExposureTime", 33434, 5), new rsj("FNumber", 33437, 5), new rsj("ExposureProgram", 34850, 3), new rsj("SpectralSensitivity", 34852, 2), new rsj("PhotographicSensitivity", 34855, 3), new rsj("OECF", 34856, 7), new rsj("SensitivityType", 34864, 3), new rsj("StandardOutputSensitivity", 34865, 4), new rsj("RecommendedExposureIndex", 34866, 4), new rsj("ISOSpeed", 34867, 4), new rsj("ISOSpeedLatitudeyyy", 34868, 4), new rsj("ISOSpeedLatitudezzz", 34869, 4), new rsj("ExifVersion", 36864, 2), new rsj("DateTimeOriginal", 36867, 2), new rsj("DateTimeDigitized", 36868, 2), new rsj("OffsetTime", 36880, 2), new rsj("OffsetTimeOriginal", 36881, 2), new rsj("OffsetTimeDigitized", 36882, 2), new rsj("ComponentsConfiguration", 37121, 7), new rsj("CompressedBitsPerPixel", 37122, 5), new rsj("ShutterSpeedValue", 37377, 10), new rsj("ApertureValue", 37378, 5), new rsj("BrightnessValue", 37379, 10), new rsj("ExposureBiasValue", 37380, 10), new rsj("MaxApertureValue", 37381, 5), new rsj("SubjectDistance", 37382, 5), new rsj("MeteringMode", 37383, 3), new rsj("LightSource", 37384, 3), new rsj(TOnSyMaYeslEl.EtSmuhoiEDwn, 37385, 3), new rsj("FocalLength", 37386, 5), new rsj("SubjectArea", 37396, 3), new rsj("MakerNote", 37500, 7), new rsj("UserComment", 37510, 7), new rsj("SubSecTime", 37520, 2), new rsj("SubSecTimeOriginal", 37521, 2), new rsj("SubSecTimeDigitized", 37522, 2), new rsj("FlashpixVersion", 40960, 7), new rsj("ColorSpace", 40961, 3), new rsj("PixelXDimension", 40962, 3, 4), new rsj("PixelYDimension", 40963, 3, 4), new rsj("RelatedSoundFile", 40964, 2), new rsj("InteroperabilityIFDPointer", 40965, 4), new rsj("FlashEnergy", 41483, 5), new rsj("SpatialFrequencyResponse", 41484, 7), new rsj("FocalPlaneXResolution", 41486, 5), new rsj("FocalPlaneYResolution", 41487, 5), new rsj("FocalPlaneResolutionUnit", 41488, 3), new rsj("SubjectLocation", 41492, 3), new rsj("ExposureIndex", 41493, 5), new rsj("SensingMethod", 41495, 3), new rsj("FileSource", 41728, 7), new rsj("SceneType", 41729, 7), new rsj("CFAPattern", 41730, 7), new rsj("CustomRendered", 41985, 3), new rsj(qcjAcSmlN.YIUVsGyCQaVybNA, 41986, 3), new rsj("WhiteBalance", 41987, 3), new rsj("DigitalZoomRatio", 41988, 5), new rsj("FocalLengthIn35mmFilm", 41989, 3), new rsj("SceneCaptureType", 41990, 3), new rsj("GainControl", 41991, 3), new rsj("Contrast", 41992, 3), new rsj("Saturation", 41993, 3), new rsj("Sharpness", 41994, 3), new rsj(oUZhwRhE.vvVgAMR, 41995, 7), new rsj("SubjectDistanceRange", 41996, 3), new rsj("ImageUniqueID", 42016, 2), new rsj("CameraOwnerName", 42032, 2), new rsj(cdVQ.SPXNKxSmT, 42033, 2), new rsj("LensSpecification", 42034, 5), new rsj("LensMake", 42035, 2), new rsj("LensModel", 42036, 2), new rsj(LmJPKwPBa.TrTiLniaKWKF, 42240, 5), new rsj("DNGVersion", 50706, 1), new rsj("DefaultCropSize", 50720, 3, 4)};
        P = rsjVarArr2;
        rsj[] rsjVarArr3 = {new rsj("GPSVersionID", 0, 1), new rsj("GPSLatitudeRef", 1, 2), new rsj("GPSLatitude", 2, 5, 10), new rsj("GPSLongitudeRef", 3, 2), new rsj("GPSLongitude", 4, 5, 10), new rsj("GPSAltitudeRef", 5, 1), new rsj("GPSAltitude", 6, 5), new rsj("GPSTimeStamp", 7, 5), new rsj("GPSSatellites", 8, 2), new rsj("GPSStatus", 9, 2), new rsj("GPSMeasureMode", 10, 2), new rsj("GPSDOP", 11, 5), new rsj("GPSSpeedRef", 12, 2), new rsj("GPSSpeed", 13, 5), new rsj("GPSTrackRef", 14, 2), new rsj("GPSTrack", 15, 5), new rsj("GPSImgDirectionRef", 16, 2), new rsj("GPSImgDirection", 17, 5), new rsj("GPSMapDatum", 18, 2), new rsj("GPSDestLatitudeRef", 19, 2), new rsj("GPSDestLatitude", 20, 5), new rsj("GPSDestLongitudeRef", 21, 2), new rsj("GPSDestLongitude", 22, 5), new rsj("GPSDestBearingRef", 23, 2), new rsj("GPSDestBearing", 24, 5), new rsj("GPSDestDistanceRef", 25, 2), new rsj(CZAHo.kJKWEfYi, 26, 5), new rsj("GPSProcessingMethod", 27, 7), new rsj("GPSAreaInformation", 28, 7), new rsj("GPSDateStamp", 29, 2), new rsj("GPSDifferential", 30, 3), new rsj("GPSHPositioningError", 31, 5)};
        Q = rsjVarArr3;
        rsj[] rsjVarArr4 = {new rsj("InteroperabilityIndex", 1, 2)};
        R = rsjVarArr4;
        rsj[] rsjVarArr5 = {new rsj("NewSubfileType", 254, 4), new rsj("SubfileType", 255, 4), new rsj("ThumbnailImageWidth", 256, 3, 4), new rsj("ThumbnailImageLength", 257, 3, 4), new rsj("BitsPerSample", 258, 3), new rsj("Compression", 259, 3), new rsj("PhotometricInterpretation", 262, 3), new rsj("ImageDescription", 270, 2), new rsj("Make", 271, 2), new rsj("Model", 272, 2), new rsj("StripOffsets", 273, 3, 4), new rsj("ThumbnailOrientation", 274, 3), new rsj("SamplesPerPixel", 277, 3), new rsj("RowsPerStrip", 278, 3, 4), new rsj("StripByteCounts", 279, 3, 4), new rsj("XResolution", 282, 5), new rsj("YResolution", 283, 5), new rsj("PlanarConfiguration", 284, 3), new rsj("ResolutionUnit", 296, 3), new rsj("TransferFunction", 301, 3), new rsj("Software", 305, 2), new rsj("DateTime", 306, 2), new rsj("Artist", 315, 2), new rsj("WhitePoint", 318, 5), new rsj("PrimaryChromaticities", 319, 5), new rsj("SubIFDPointer", 330, 4), new rsj("JPEGInterchangeFormat", 513, 4), new rsj("JPEGInterchangeFormatLength", 514, 4), new rsj("YCbCrCoefficients", 529, 5), new rsj("YCbCrSubSampling", 530, 3), new rsj("YCbCrPositioning", 531, 3), new rsj("ReferenceBlackWhite", 532, 5), new rsj("Copyright", 33432, 2), new rsj("ExifIFDPointer", 34665, 4), new rsj("GPSInfoIFDPointer", 34853, 4), new rsj("DNGVersion", 50706, 1), new rsj("DefaultCropSize", 50720, 3, 4)};
        S = rsjVarArr5;
        T = new rsj("StripOffsets", 273, 3);
        rsj[] rsjVarArr6 = {new rsj("ThumbnailImage", 256, 7), new rsj("CameraSettingsIFDPointer", 8224, 4), new rsj("ImageProcessingIFDPointer", 8256, 4)};
        U = rsjVarArr6;
        rsj[] rsjVarArr7 = {new rsj("PreviewImageStart", 257, 4), new rsj("PreviewImageLength", 258, 4)};
        V = rsjVarArr7;
        rsj[] rsjVarArr8 = {new rsj("AspectFrame", 4371, 3)};
        W = rsjVarArr8;
        rsj[] rsjVarArr9 = {new rsj("ColorSpace", 55, 3)};
        X = rsjVarArr9;
        k = new rsj[][]{rsjVarArr, rsjVarArr2, rsjVarArr3, rsjVarArr4, rsjVarArr5, rsjVarArr, rsjVarArr6, rsjVarArr7, rsjVarArr8, rsjVarArr9};
        Y = new rsj[]{new rsj("SubIFDPointer", 330, 4), new rsj("ExifIFDPointer", 34665, 4), new rsj("GPSInfoIFDPointer", 34853, 4), new rsj(qcjAcSmlN.bzDiJsbGJlyEszi, 40965, 4), new rsj("CameraSettingsIFDPointer", 8224, 1), new rsj("ImageProcessingIFDPointer", 8256, 1)};
        y = new HashMap[10];
        z = new HashMap[10];
        A = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", YyLACfm.vWpbfPExYGhaqKu, "ExposureTime", "SubjectDistance")));
        B = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        h = charsetForName;
        i = "Exif\u0000\u0000".getBytes(charsetForName);
        C = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        w = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        x = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            rsj[][] rsjVarArr10 = k;
            int length = rsjVarArr10.length;
            if (i2 >= 10) {
                rsj[] rsjVarArr11 = Y;
                Integer numValueOf = Integer.valueOf(rsjVarArr11[0].b);
                HashMap map = B;
                map.put(numValueOf, 5);
                map.put(Integer.valueOf(rsjVarArr11[1].b), 1);
                map.put(Integer.valueOf(rsjVarArr11[2].b), 2);
                map.put(Integer.valueOf(rsjVarArr11[3].b), 3);
                map.put(Integer.valueOf(rsjVarArr11[4].b), 7);
                map.put(Integer.valueOf(rsjVarArr11[5].b), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            y[i2] = new HashMap();
            z[i2] = new HashMap();
            for (rsj rsjVar : rsjVarArr10[i2]) {
                y[i2].put(Integer.valueOf(rsjVar.b), rsjVar);
                z[i2].put(rsjVar.d, rsjVar);
            }
            i2++;
        }
    }

    public cue(InputStream inputStream) throws Throwable {
        int length = k.length;
        this.G = new HashMap[10];
        this.H = new HashSet(10);
        this.j = ByteOrder.BIG_ENDIAN;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.E = (AssetManager.AssetInputStream) inputStream;
            this.D = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.E = null;
                this.D = fileInputStream.getFD();
            } catch (Exception unused) {
            }
        } else {
            this.E = null;
            this.D = null;
        }
        i(inputStream);
    }

    private final void c() throws Throwable {
        String strB = b("DateTimeOriginal");
        if (strB != null && b("DateTime") == null) {
            this.G[0].put("DateTime", cuc.b(strB));
        }
        if (b("ImageWidth") == null) {
            this.G[0].put("ImageWidth", cuc.c(0L, this.j));
        }
        if (b("ImageLength") == null) {
            this.G[0].put("ImageLength", cuc.c(0L, this.j));
        }
        if (b("Orientation") == null) {
            this.G[0].put("Orientation", cuc.c(0L, this.j));
        }
        if (b("LightSource") == null) {
            this.G[1].put("LightSource", cuc.c(0L, this.j));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0103, code lost:
    
        r20.c = r19.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0107, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0047. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x004a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x004d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f1 A[LOOP:0: B:7:0x001e->B:46:0x00f1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void d(defpackage.cub r20, int r21, int r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cue.d(cub, int, int):void");
    }

    private final void e(cub cubVar) throws Throwable {
        byte[] bArr;
        int length;
        cubVar.c = ByteOrder.BIG_ENDIAN;
        int i2 = cubVar.b;
        int length2 = s.length;
        cubVar.b(8);
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (z2) {
                if (z3) {
                    return;
                } else {
                    z3 = false;
                }
            }
            try {
                int i3 = cubVar.readInt();
                int i4 = cubVar.readInt();
                int i5 = cubVar.b;
                int i6 = i5 + i3;
                int i7 = i5 - i2;
                if (i7 == 16) {
                    if (i4 != 1229472850) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                    }
                    i7 = 16;
                }
                if (i4 == 1229278788) {
                    return;
                }
                if (i4 == 1700284774) {
                    if (z2) {
                        continue;
                    } else {
                        this.J = i7;
                        byte[] bArr2 = new byte[i3];
                        cubVar.readFully(bArr2);
                        int i8 = cubVar.readInt();
                        CRC32 crc32 = new CRC32();
                        crc32.update(101);
                        crc32.update(25944);
                        crc32.update(6641737);
                        crc32.update(1700284774);
                        crc32.update(bArr2);
                        if (((int) crc32.getValue()) != i8) {
                            throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i8 + ", calculated CRC value: " + crc32.getValue());
                        }
                        k(bArr2, 0);
                        o();
                        m(new cub(bArr2));
                        z2 = true;
                    }
                } else if (i4 == 1767135348 && !z3 && i3 >= (length = (bArr = d).length)) {
                    byte[] bArr3 = new byte[length];
                    cubVar.readFully(bArr3);
                    if (Arrays.equals(bArr3, bArr)) {
                        int i9 = cubVar.b - i2;
                        int i10 = i3 - length;
                        byte[] bArr4 = new byte[i10];
                        cubVar.readFully(bArr4);
                        this.N = new cuc(1, i10, i9, bArr4);
                        z3 = true;
                    }
                }
                cubVar.b((i6 + 4) - cubVar.b);
            } catch (EOFException e2) {
                throw new IOException("Encountered corrupt PNG file.", e2);
            }
        }
    }

    private final void g(cub cubVar, HashMap map) throws Throwable {
        cuc cucVar = (cuc) map.get("JPEGInterchangeFormat");
        cuc cucVar2 = (cuc) map.get("JPEGInterchangeFormatLength");
        if (cucVar == null || cucVar2 == null) {
            return;
        }
        int iA = cucVar.a(this.j);
        int iA2 = cucVar2.a(this.j);
        if (this.F == 7) {
            iA += this.K;
        }
        if (iA <= 0 || iA2 <= 0 || this.E != null || this.D != null) {
            return;
        }
        cubVar.b(iA);
        cubVar.readFully(new byte[iA2]);
    }

    private final void h(cub cubVar, HashMap map) throws IOException {
        int length;
        int length2;
        byte[] bArr;
        cuc cucVar = (cuc) map.get("StripOffsets");
        cuc cucVar2 = (cuc) map.get("StripByteCounts");
        if (cucVar == null || cucVar2 == null) {
            return;
        }
        long[] jArrG = com.g(cucVar.f(this.j));
        long[] jArrG2 = com.g(cucVar2.f(this.j));
        if (jArrG == null || (length = jArrG.length) == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrG2 == null || (length2 = jArrG2.length) == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (length != length2) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j = 0;
        for (long j2 : jArrG2) {
            j += j2;
        }
        byte[] bArr2 = new byte[(int) j];
        this.I = true;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int length3 = jArrG.length;
            if (i2 >= length3) {
                if (this.I) {
                    long j3 = jArrG[0];
                    return;
                }
                return;
            }
            int i5 = (int) jArrG[i2];
            int i6 = (int) jArrG2[i2];
            if (i2 < length3 - 1) {
                bArr = bArr2;
                if (i5 + i6 != jArrG[i2 + 1]) {
                    this.I = false;
                }
            } else {
                bArr = bArr2;
            }
            int i7 = i5 - i3;
            if (i7 < 0) {
                return;
            }
            try {
                cubVar.b(i7);
                int i8 = i3 + i7;
                byte[] bArr3 = new byte[i6];
                cubVar.readFully(bArr3);
                i2++;
                i3 = i8 + i6;
                System.arraycopy(bArr3, 0, bArr, i4, i6);
                i4 += i6;
                bArr2 = bArr;
            } catch (EOFException unused) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0380 A[Catch: all -> 0x0428, IOException | UnsupportedOperationException -> 0x042d, IOException | UnsupportedOperationException -> 0x042d, TryCatch #2 {all -> 0x0428, blocks: (B:3:0x0007, B:5:0x000e, B:6:0x001a, B:7:0x002f, B:9:0x0044, B:11:0x004c, B:12:0x0058, B:14:0x005b, B:16:0x0061, B:27:0x0086, B:41:0x00af, B:54:0x00cc, B:56:0x00d1, B:59:0x00d9, B:61:0x00de, B:64:0x00e7, B:66:0x00ec, B:68:0x00f1, B:71:0x00fb, B:73:0x0100, B:48:0x00c0, B:49:0x00c3, B:52:0x00c7, B:34:0x0094, B:35:0x0097, B:38:0x009b, B:79:0x0116, B:86:0x0127, B:92:0x013b, B:94:0x014c, B:96:0x0174, B:100:0x0185, B:103:0x01a0, B:104:0x01ae, B:106:0x01ba, B:108:0x01c4, B:111:0x01c8, B:113:0x01cf, B:115:0x01d5, B:117:0x01dd, B:118:0x01e1, B:119:0x01f9, B:97:0x017a, B:99:0x0180, B:170:0x0366, B:122:0x0212, B:124:0x0223, B:125:0x0230, B:128:0x0246, B:129:0x024d, B:130:0x0252, B:169:0x0363, B:177:0x037c, B:178:0x037f, B:179:0x0380, B:181:0x0389, B:183:0x0391, B:185:0x0398, B:187:0x03e9, B:189:0x03f7, B:190:0x041a, B:192:0x0424, B:75:0x0105, B:77:0x010d), top: B:205:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0389 A[Catch: all -> 0x0428, IOException | UnsupportedOperationException -> 0x042d, IOException | UnsupportedOperationException -> 0x042d, TryCatch #2 {all -> 0x0428, blocks: (B:3:0x0007, B:5:0x000e, B:6:0x001a, B:7:0x002f, B:9:0x0044, B:11:0x004c, B:12:0x0058, B:14:0x005b, B:16:0x0061, B:27:0x0086, B:41:0x00af, B:54:0x00cc, B:56:0x00d1, B:59:0x00d9, B:61:0x00de, B:64:0x00e7, B:66:0x00ec, B:68:0x00f1, B:71:0x00fb, B:73:0x0100, B:48:0x00c0, B:49:0x00c3, B:52:0x00c7, B:34:0x0094, B:35:0x0097, B:38:0x009b, B:79:0x0116, B:86:0x0127, B:92:0x013b, B:94:0x014c, B:96:0x0174, B:100:0x0185, B:103:0x01a0, B:104:0x01ae, B:106:0x01ba, B:108:0x01c4, B:111:0x01c8, B:113:0x01cf, B:115:0x01d5, B:117:0x01dd, B:118:0x01e1, B:119:0x01f9, B:97:0x017a, B:99:0x0180, B:170:0x0366, B:122:0x0212, B:124:0x0223, B:125:0x0230, B:128:0x0246, B:129:0x024d, B:130:0x0252, B:169:0x0363, B:177:0x037c, B:178:0x037f, B:179:0x0380, B:181:0x0389, B:183:0x0391, B:185:0x0398, B:187:0x03e9, B:189:0x03f7, B:190:0x041a, B:192:0x0424, B:75:0x0105, B:77:0x010d), top: B:205:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d1 A[Catch: all -> 0x0428, IOException | UnsupportedOperationException -> 0x042d, IOException | UnsupportedOperationException -> 0x042d, TryCatch #2 {all -> 0x0428, blocks: (B:3:0x0007, B:5:0x000e, B:6:0x001a, B:7:0x002f, B:9:0x0044, B:11:0x004c, B:12:0x0058, B:14:0x005b, B:16:0x0061, B:27:0x0086, B:41:0x00af, B:54:0x00cc, B:56:0x00d1, B:59:0x00d9, B:61:0x00de, B:64:0x00e7, B:66:0x00ec, B:68:0x00f1, B:71:0x00fb, B:73:0x0100, B:48:0x00c0, B:49:0x00c3, B:52:0x00c7, B:34:0x0094, B:35:0x0097, B:38:0x009b, B:79:0x0116, B:86:0x0127, B:92:0x013b, B:94:0x014c, B:96:0x0174, B:100:0x0185, B:103:0x01a0, B:104:0x01ae, B:106:0x01ba, B:108:0x01c4, B:111:0x01c8, B:113:0x01cf, B:115:0x01d5, B:117:0x01dd, B:118:0x01e1, B:119:0x01f9, B:97:0x017a, B:99:0x0180, B:170:0x0366, B:122:0x0212, B:124:0x0223, B:125:0x0230, B:128:0x0246, B:129:0x024d, B:130:0x0252, B:169:0x0363, B:177:0x037c, B:178:0x037f, B:179:0x0380, B:181:0x0389, B:183:0x0391, B:185:0x0398, B:187:0x03e9, B:189:0x03f7, B:190:0x041a, B:192:0x0424, B:75:0x0105, B:77:0x010d), top: B:205:0x0007 }] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v12, types: [android.media.MediaMetadataRetriever] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void i(java.io.InputStream r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1073
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cue.i(java.io.InputStream):void");
    }

    private final void j(cub cubVar) throws IOException {
        ByteOrder byteOrderU = u(cubVar);
        this.j = byteOrderU;
        cubVar.c = byteOrderU;
        int unsignedShort = cubVar.readUnsignedShort();
        int i2 = this.F;
        if (i2 != 7 && i2 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: ".concat(String.valueOf(Integer.toHexString(unsignedShort))));
        }
        int i3 = cubVar.readInt();
        if (i3 < 8) {
            throw new IOException(a.bv(i3, "Invalid first Ifd offset: "));
        }
        int i4 = i3 - 8;
        if (i4 > 0) {
            cubVar.b(i4);
        }
    }

    private final void k(byte[] bArr, int i2) throws IOException {
        cub cubVar = new cub(bArr, (byte[]) null);
        j(cubVar);
        r(cubVar, i2);
    }

    private final void l(int i2, String str, String str2) {
        HashMap[] mapArr = this.G;
        if (mapArr[i2].isEmpty() || mapArr[i2].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i2];
        map.put(str2, (cuc) map.get(str));
        mapArr[i2].remove(str);
    }

    private final void m(cub cubVar) throws Throwable {
        cuc cucVar;
        HashMap map = this.G[4];
        cuc cucVar2 = (cuc) map.get("Compression");
        if (cucVar2 == null) {
            g(cubVar, map);
            return;
        }
        int iA = cucVar2.a(this.j);
        if (iA != 1) {
            if (iA == 6) {
                g(cubVar, map);
                return;
            } else if (iA != 7) {
                return;
            }
        }
        cuc cucVar3 = (cuc) map.get("BitsPerSample");
        if (cucVar3 != null) {
            int[] iArr = (int[]) cucVar3.f(this.j);
            int[] iArr2 = a;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.F != 3 || (cucVar = (cuc) map.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int iA2 = cucVar.a(this.j);
                if (iA2 == 1) {
                    if (!Arrays.equals(iArr, b)) {
                        return;
                    }
                } else if (iA2 != 6 || !Arrays.equals(iArr, iArr2)) {
                    return;
                }
            }
            h(cubVar, map);
        }
    }

    private final void n(int i2, int i3) throws Throwable {
        HashMap[] mapArr = this.G;
        if (mapArr[i2].isEmpty() || mapArr[i3].isEmpty()) {
            return;
        }
        cuc cucVar = (cuc) mapArr[i2].get("ImageLength");
        cuc cucVar2 = (cuc) mapArr[i2].get("ImageWidth");
        cuc cucVar3 = (cuc) mapArr[i3].get("ImageLength");
        cuc cucVar4 = (cuc) mapArr[i3].get("ImageWidth");
        if (cucVar == null || cucVar2 == null || cucVar3 == null || cucVar4 == null) {
            return;
        }
        int iA = cucVar.a(this.j);
        int iA2 = cucVar2.a(this.j);
        int iA3 = cucVar3.a(this.j);
        int iA4 = cucVar4.a(this.j);
        if (iA >= iA3 || iA2 >= iA4) {
            return;
        }
        HashMap map = mapArr[i2];
        mapArr[i2] = mapArr[i3];
        mapArr[i3] = map;
    }

    private final void o() throws Throwable {
        n(0, 5);
        n(0, 4);
        n(5, 4);
        HashMap[] mapArr = this.G;
        cuc cucVar = (cuc) mapArr[1].get("PixelXDimension");
        cuc cucVar2 = (cuc) mapArr[1].get("PixelYDimension");
        if (cucVar != null && cucVar2 != null) {
            mapArr[0].put("ImageWidth", cucVar);
            mapArr[0].put("ImageLength", cucVar2);
        }
        if (mapArr[4].isEmpty() && p(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        p(mapArr[4]);
        l(0, "ThumbnailOrientation", "Orientation");
        l(0, "ThumbnailImageLength", "ImageLength");
        l(0, "ThumbnailImageWidth", "ImageWidth");
        l(5, "ThumbnailOrientation", "Orientation");
        l(5, "ThumbnailImageLength", "ImageLength");
        l(5, "ThumbnailImageWidth", "ImageWidth");
        l(4, "Orientation", "ThumbnailOrientation");
        l(4, "ImageLength", "ThumbnailImageLength");
        l(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private final boolean p(HashMap map) {
        cuc cucVar = (cuc) map.get("ImageLength");
        cuc cucVar2 = (cuc) map.get("ImageWidth");
        if (cucVar == null || cucVar2 == null) {
            return false;
        }
        return cucVar.a(this.j) <= 512 && cucVar2.a(this.j) <= 512;
    }

    private final void q(cub cubVar) throws Throwable {
        j(cubVar);
        r(cubVar, 0);
        s(cubVar, 0);
        s(cubVar, 5);
        s(cubVar, 4);
        o();
        if (this.F == 8) {
            HashMap[] mapArr = this.G;
            cuc cucVar = (cuc) mapArr[1].get("MakerNote");
            if (cucVar != null) {
                cub cubVar2 = new cub(cucVar.d, (byte[]) null);
                cubVar2.c = this.j;
                cubVar2.b(6);
                r(cubVar2, 9);
                cuc cucVar2 = (cuc) mapArr[9].get("ColorSpace");
                if (cucVar2 != null) {
                    mapArr[1].put("ColorSpace", cucVar2);
                }
            }
        }
    }

    private final void s(cub cubVar, int i2) throws Throwable {
        cuc cucVarE;
        cuc cucVarE2;
        HashMap[] mapArr = this.G;
        cuc cucVar = (cuc) mapArr[i2].get("DefaultCropSize");
        cuc cucVar2 = (cuc) mapArr[i2].get("SensorTopBorder");
        cuc cucVar3 = (cuc) mapArr[i2].get("SensorLeftBorder");
        cuc cucVar4 = (cuc) mapArr[i2].get("SensorBottomBorder");
        cuc cucVar5 = (cuc) mapArr[i2].get("SensorRightBorder");
        if (cucVar != null) {
            if (cucVar.a == 5) {
                cud[] cudVarArr = (cud[]) cucVar.f(this.j);
                if (cudVarArr == null || cudVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=".concat(String.valueOf(Arrays.toString(cudVarArr))));
                    return;
                } else {
                    cucVarE = cuc.d(cudVarArr[0], this.j);
                    cucVarE2 = cuc.d(cudVarArr[1], this.j);
                }
            } else {
                int[] iArr = (int[]) cucVar.f(this.j);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=".concat(String.valueOf(Arrays.toString(iArr))));
                    return;
                } else {
                    cucVarE = cuc.e(iArr[0], this.j);
                    cucVarE2 = cuc.e(iArr[1], this.j);
                }
            }
            mapArr[i2].put("ImageWidth", cucVarE);
            mapArr[i2].put("ImageLength", cucVarE2);
            return;
        }
        if (cucVar2 != null && cucVar3 != null && cucVar4 != null && cucVar5 != null) {
            int iA = cucVar2.a(this.j);
            int iA2 = cucVar4.a(this.j);
            int iA3 = cucVar5.a(this.j);
            int iA4 = cucVar3.a(this.j);
            if (iA2 <= iA || iA3 <= iA4) {
                return;
            }
            cuc cucVarE3 = cuc.e(iA2 - iA, this.j);
            cuc cucVarE4 = cuc.e(iA3 - iA4, this.j);
            mapArr[i2].put("ImageLength", cucVarE3);
            mapArr[i2].put("ImageWidth", cucVarE4);
            return;
        }
        cuc cucVar6 = (cuc) mapArr[i2].get("ImageLength");
        cuc cucVar7 = (cuc) mapArr[i2].get("ImageWidth");
        if (cucVar6 == null || cucVar7 == null) {
            cuc cucVar8 = (cuc) mapArr[i2].get("JPEGInterchangeFormat");
            cuc cucVar9 = (cuc) mapArr[i2].get("JPEGInterchangeFormatLength");
            if (cucVar8 == null || cucVar9 == null) {
                return;
            }
            int iA5 = cucVar8.a(this.j);
            int iA6 = cucVar8.a(this.j);
            cubVar.c(iA5);
            byte[] bArr = new byte[iA6];
            cubVar.readFully(bArr);
            d(new cub(bArr), iA5, i2);
        }
    }

    private static final int t(byte[] bArr) throws Throwable {
        cub cubVar;
        long j;
        byte[] bArr2;
        long j2;
        cub cubVar2 = null;
        try {
            cubVar = new cub(bArr);
            try {
                j = cubVar.readInt();
                bArr2 = new byte[4];
                cubVar.readFully(bArr2);
            } catch (Exception unused) {
                cubVar2 = cubVar;
                if (cubVar2 != null) {
                    cubVar2.close();
                }
                return 0;
            } catch (Throwable th) {
                th = th;
                cubVar2 = cubVar;
                if (cubVar2 != null) {
                    cubVar2.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
        if (!Arrays.equals(bArr2, l)) {
            cubVar.close();
            return 0;
        }
        if (j == 1) {
            j = cubVar.readLong();
            j2 = 16;
            if (j < 16) {
                cubVar.close();
                return 0;
            }
        } else {
            j2 = 8;
        }
        if (j > 5000) {
            j = 5000;
        }
        long j3 = j - j2;
        if (j3 < 8) {
            cubVar.close();
            return 0;
        }
        byte[] bArr3 = new byte[4];
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        for (long j4 = 0; j4 < (j3 >> 2); j4++) {
            try {
                cubVar.readFully(bArr3);
                if (j4 != 1) {
                    if (Arrays.equals(bArr3, m)) {
                        z2 = true;
                    } else if (Arrays.equals(bArr3, n)) {
                        z3 = true;
                    } else if (Arrays.equals(bArr3, o) || Arrays.equals(bArr3, p)) {
                        z4 = true;
                    }
                    if (!z2) {
                        continue;
                    } else {
                        if (z3) {
                            cubVar.close();
                            return 12;
                        }
                        if (z4) {
                            cubVar.close();
                            return 15;
                        }
                    }
                }
            } catch (EOFException unused3) {
                cubVar.close();
                return 0;
            }
        }
        cubVar.close();
        return 0;
    }

    private static final ByteOrder u(cub cubVar) throws IOException {
        short s2 = cubVar.readShort();
        if (s2 == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s2 == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: ".concat(String.valueOf(Integer.toHexString(s2))));
    }

    public final String b(String str) throws Throwable {
        double d2;
        cuc cucVarA = a(str);
        if (cucVarA == null) {
            return null;
        }
        if (str.equals("GPSTimeStamp")) {
            int i2 = cucVarA.a;
            if (i2 != 5 && i2 != 10) {
                Log.w("ExifInterface", a.bv(i2, "GPS Timestamp format is not rational. format="));
                return null;
            }
            cud[] cudVarArr = (cud[]) cucVarA.f(this.j);
            if (cudVarArr == null || cudVarArr.length != 3) {
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=".concat(String.valueOf(Arrays.toString(cudVarArr))));
                return null;
            }
            cud cudVar = cudVarArr[0];
            Integer numValueOf = Integer.valueOf((int) (cudVar.a / cudVar.b));
            cud cudVar2 = cudVarArr[1];
            Integer numValueOf2 = Integer.valueOf((int) (cudVar2.a / cudVar2.b));
            cud cudVar3 = cudVarArr[2];
            return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (cudVar3.a / cudVar3.b)));
        }
        if (!A.contains(str)) {
            return cucVarA.g(this.j);
        }
        try {
            Object objF = cucVarA.f(this.j);
            if (objF == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objF instanceof String) {
                d2 = Double.parseDouble((String) objF);
            } else if (objF instanceof long[]) {
                long[] jArr = (long[]) objF;
                if (jArr.length != 1) {
                    throw new NumberFormatException("There are more than one component");
                }
                d2 = jArr[0];
            } else if (objF instanceof int[]) {
                int[] iArr = (int[]) objF;
                if (iArr.length != 1) {
                    throw new NumberFormatException("There are more than one component");
                }
                d2 = iArr[0];
            } else if (objF instanceof double[]) {
                double[] dArr = (double[]) objF;
                if (dArr.length != 1) {
                    throw new NumberFormatException("There are more than one component");
                }
                d2 = dArr[0];
            } else {
                if (!(objF instanceof cud[])) {
                    throw new NumberFormatException("Couldn't find a double value");
                }
                cud[] cudVarArr2 = (cud[]) objF;
                if (cudVarArr2.length != 1) {
                    throw new NumberFormatException("There are more than one component");
                }
                cud cudVar4 = cudVarArr2[0];
                d2 = cudVar4.a / cudVar4.b;
            }
            return Double.toString(d2);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private final void f(cub cubVar) throws Throwable {
        cubVar.c = ByteOrder.LITTLE_ENDIAN;
        int length = t.length;
        cubVar.b(4);
        int i2 = cubVar.readInt() + 8;
        int length2 = u.length;
        cubVar.b(4);
        int i3 = 12;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                cubVar.readFully(bArr);
                int i4 = cubVar.readInt();
                int i5 = i3 + 8;
                if (Arrays.equals(v, bArr)) {
                    byte[] bArrCopyOfRange = new byte[i4];
                    cubVar.readFully(bArrCopyOfRange);
                    byte[] bArr2 = i;
                    if (com.f(bArrCopyOfRange, bArr2)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr2.length, i4);
                    }
                    this.J = i5;
                    k(bArrCopyOfRange, 0);
                    m(new cub(bArrCopyOfRange));
                    return;
                }
                if (i4 % 2 == 1) {
                    i4++;
                }
                i3 = i5 + i4;
                if (i3 == i2) {
                    return;
                }
                if (i3 > i2) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                cubVar.b(i4);
            } catch (EOFException e2) {
                throw new IOException(VnmwoBe.VeAklmMRzaPu, e2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
    
        if (r11 == 8) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void r(defpackage.cub r24, int r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cue.r(cub, int):void");
    }

    public final cuc a(String str) {
        cuc cucVar;
        int i2;
        cuc cucVar2;
        if (true == "ISOSpeedRatings".equals(str)) {
            str = OPuAVreQM.nSjcUspUlAg;
        }
        int i3 = 0;
        if ("Xmp".equals(str) && (i2 = this.F) != 4 && ((i2 == 9 || i2 == 15 || i2 == 12 || i2 == 13) && (cucVar2 = this.N) != null)) {
            return cucVar2;
        }
        while (true) {
            int length = k.length;
            if (i3 >= 10) {
                if (!"Xmp".equals(str) || (cucVar = this.N) == null) {
                    return null;
                }
                return cucVar;
            }
            cuc cucVar3 = (cuc) this.G[i3].get(str);
            if (cucVar3 != null) {
                return cucVar3;
            }
            i3++;
        }
    }
}
